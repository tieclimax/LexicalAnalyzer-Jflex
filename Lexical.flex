import java.util.ArrayList;
%%

%class LexicalAnalyzer
%standalone

%{
	ArrayList<String> symbolTable = new ArrayList<String>();
    	boolean checkTable(String word)
	{
		for(int i = 0; i < symbolTable.size(); i++)
		{
			if(symbolTable.get(i).equals(word))  return true;
		}
		return false;
	}	
%}

	LineTerminator = \r|\n|\r\n
	WhiteSpace = {LineTerminator}|[\t\f]|(" ")
	Comment = ((\/\*)(.|(\r|\n|\r\n))*(\*\/))|(\/\/.*)
	Identifier = [a-zA-z][a-zA-z0-9]*
	Integer = 0|[1-9][0-9]*
	Operator = ((\<\=)|(\>\=)|(\=\=)|(\+\+)|(\-\-)|\>|\<|\+|\-|\*|\/)|(\=)
	string = (\")(.|(\r|\n|\r\n))*(\")
	PARENTHESESandSEMICOLON = (";")|("(")|(")")
	KEYWORDS = ("if")|("then")|("else")|("endif")|("while")|("do")|("endwhile")|("print")|("newline")|("read")

//   optional & declaration
%%
//   lexical rules

	{string}
	{
		System.out.println("string : "+yytext());
	}
	
	({Integer}{Identifier})|([^ \t\f\r\n\r\n\w]+{Identifier})
	{
		System.out.printf("ERROR");
		System.exit(0);
	}
	{Comment}
	{
		//DO NOTHING
	}
	{Operator}
	{
		System.out.println("operator : "+yytext());
	}
	{PARENTHESESandSEMICOLON}
	{
		if(yytext().equals(";"))
			System.out.println("semicolon : "+";");
		else 
			System.out.println("parentheses : "+yytext());
	}
	{KEYWORDS}
	{
		System.out.println("keywords : "+yytext());
	}
	{Identifier}
	{
		if(checkTable(yytext())) 
                  System.out.printf("identifier \"%s\" already in symbol table\n",yytext());
		          else
		          {
			        symbolTable.add(yytext());
			        System.out.println("new identifier : "+yytext());
		          }
	}	
	{Integer}
	{
		System.out.println("integer : "+yytext());
	}
	
	{WhiteSpace}
	{
		
	}
	
