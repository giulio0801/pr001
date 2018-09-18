package it.nextre.academy.enumerazioni;

public enum HttpMetodi {
    GET(10100),
    POST(10200),
    PUT(10300),
    DELETE(10400), OPTION(10500), PATCH(10600){
        @Override
        public String toString() {
            return "[ "+this.name()+" ]";

        }
    };

    private int code;

    private HttpMetodi(int code){
        this.code=code;
    }
    //HttpMetodi(){}

    public int getCode(){
        return this.code;
    }

    @Override
    public String toString() {
        return "[ "+this.name()+" ("+this.getCode()+") ]";
    }



}//end class
