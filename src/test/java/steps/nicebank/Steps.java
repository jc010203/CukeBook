package steps.nicebank;

import support.KnowsTheDomain;

/**
 * Created by juan.hernandez on 7/17/17.
 */
public class Steps {

    protected static KnowsTheDomain helper;

    public static KnowsTheDomain getHelper(){
        if(null == helper){
            helper = new KnowsTheDomain();
        }
        return helper;
    }

}
