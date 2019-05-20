package testdata;

import java.util.Random;

/**
 * @author phantom
 * @Description 产生测试的数据
 * @date 2018/10/22/022
 */
public class TestData{

    private static int MAXNUMBER = 3000 ;

    /**产生数据的默认个数*/
    private int numberOfTestData = 3000 ;

    /**
     * 产生数据
     * @param seed 指定产生数据的种子
     * @return data
     */
    public int[] generateTestData (int seed){

        //初始化列表
        int[] data = new int[numberOfTestData];

        //根据指定的种子产生数据，种子与当前测试的额重复次数有关
        Random random = new Random(seed);

        //产生数据
        for (int i = 0; i < numberOfTestData; i++) {
            data[i] = random.nextInt(MAXNUMBER -1000);
        }
        return data;
    }


    /**
     * 为MR8产生测试数据:20-9919
     * @param seed 产生测试数据的粽子
     * @return data
     */
    public int[] generateTestDataForMR8(int seed){
        //初始化列表
        int[] data = new int[numberOfTestData];

        //根据指定的种子产生数据，种子与当前测试的额重复次数有关
        Random random = new Random(seed);

        //产生数据
        for (int i = 0; i < numberOfTestData; i++) {
            data[i] = random.nextInt(MAXNUMBER - 1000) + 20;
        }
        return data;
    }




    /**
     * 为MR7产生10000个偶数测试数据:0-9998
     * @param seed 产生测试数据的粽子
     * @return data
     */
    public int[] generateTestDataForMR7(int seed){
        //初始化列表
        int[] data = new int[numberOfTestData];

        //根据指定的种子产生数据，种子与当前测试的额重复次数有关
        Random random = new Random(seed);

        //产生数据
        for (int i = 0; i < numberOfTestData; i++) {
            //该数字保证产生的随机数最大值为4998
            int tempMax = (MAXNUMBER - 10) / 2;
            //生成0-9996的偶数
            data[i] = random.nextInt(tempMax) * 2;
        }
        return data;
    }






    public int getNumberOfTestData() {
        return numberOfTestData;
    }
}
