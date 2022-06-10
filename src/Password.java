//public class Password {
//    public boolean isValid(String password) {
//        int count=0;
//        if(password.length()<10) {
//            return false;
//        }
//        if(password.contains(" ") || password.contains("`") || password.contains("~") || password.contains("!")
//                || password.contains("@") || password.contains("#") || password.contains("$") || password.contains("%")
//                || password.contains("^") || password.contains("&") || password.contains("*") || password.contains("(")
//                || password.contains(")") || password.contains("-") || password.contains("_") || password.contains("=")
//                || password.contains("+") || password.contains("[") || password.contains("{") || password.contains("]")
//                || password.contains("}") || password.contains(";") || password.contains(":") || password.contains("'")
//                || password.contains("\"") || password.contains(",") || password.contains("<") || password.contains(".")
//                || password.contains(">") || password.contains("/") || password.contains("?"))
//        {
//            return false;
//        }
//        for(int i=0; i<password.length(); i++) {
//            char ch = password.charAt(i);
//            if(ch<48 && ch>57) {
//                count++;
//            }
//
//        }
//
//
//    }
//}
