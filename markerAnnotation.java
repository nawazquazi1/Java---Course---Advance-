///                                                                       بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِي                                                                       م
//                                                                   لا إله إلا الله محمد رسول الله
//                   اَللّٰھُمَّ صَلِّ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا صَلَّیْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ اَللّٰھُمَّ بَارِکْ عَلٰی مُحَمَّدٍ وَّعَلٰٓی اٰلِ مُحَمَّدٍ کَمَا بَارَکْتَ عَلٰٓی اِبْرَاھِیْمَ وَعَلٰٓی اٰلِ اِبْرَاھِیْمَ اِنَّکَ حَمِیْدٌ مَّجِیْدٌ 6
@markerAnnotation(value = 123)
class Annotation{
    public void syHello(){
        System.out.println("hello");
    }
}
class main156{
    public static void main(String[] args) throws NoSuchMethodException {

//        Annotation s=new Annotation();
//        Method method1=s.getClass().getMethod("syHello");

//        markerAnnotation markerAnnotation=method1.getAnnotation(markerAnnotation.class);
//        System.out.println("value is "+markerAnnotation.value());

        Annotation ae=new Annotation();
        Class<? extends Annotation> c=ae.getClass();
        System.out.println(c.getName());

        markerAnnotation annotation= (markerAnnotation) c.getAnnotation(markerAnnotation.class);
        System.out.println(annotation.value());

    }

}
