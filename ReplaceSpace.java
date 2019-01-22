package offer;

public class ReplaceSpace {
    public String replaceSpace(StringBuffer str){
        int countSpace=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
                ++countSpace;
        }
        int originalLength=str.length();
        int newLength=originalLength+2*countSpace;
        int indexOfOriginal=originalLength-1;
        int indexOfNew=newLength-1;
        str.setLength(newLength);
        while(indexOfOriginal>=0 && indexOfNew>indexOfOriginal){
            if(str.charAt(indexOfOriginal)==' '){
                str.setCharAt(indexOfNew--,'0');
                str.setCharAt(indexOfNew--,'2');
                str.setCharAt(indexOfNew--,'%');
            }else{
                str.setCharAt(indexOfNew--,str.charAt(indexOfOriginal));
            }
            indexOfOriginal--;
        }
        return str.toString();
    }
}
