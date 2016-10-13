package openscience.crowdsource.video.experiments.caffe;

/**
 * Created by daniil on 10/11/16.
 */
public class CaffeService {
    static {
        System.loadLibrary("1caffe");
        System.loadLibrary("caffe_jni");
    }
}
