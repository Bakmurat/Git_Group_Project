package yaroslav_package;

public class Array_1 {

    public boolean firstLast6(int[] nums) {


        if (nums.length > 1 && nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }

    }

    public boolean commonEnd(int[] a, int[] b) {
        boolean tr = false;
        if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
            tr = true;
        }
        return tr;
    }

    public int[] reverse3(int[] nums) {
        int[] reversed = {nums[2], nums[1], nums[0]};
        return reversed;
    }

    public int[] middleWay(int[] a, int[] b) {

        int[] mid = {a[1], b[1]};

        return mid;
    }

    public boolean no23(int[] nums) {
        boolean notcontains = false;

        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) {
            notcontains = true;
        }

        return notcontains;
    }

    public int[] fix23(int[] nums) {

        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        } else if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }

        return nums;

    }

    public int[] makeMiddle(int[] nums) {

        int[] middle = {nums[nums.length / 2 - 1], nums[nums.length / 2]};

        return middle;
    }

    public int[] midThree(int[] nums) {

        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2],
                nums[nums.length / 2 + 1]};


    }

    public boolean unlucky1(int[] nums) {

        if (nums.length >= 2 &&
                (nums[0] == 1 && nums[1] == 3 || nums[nums.length - 2] == 1 &&
                        nums[nums.length - 1] == 3))
            return true;

        if (nums.length >= 3 && nums[1] == 1 && nums[2] == 3)
            return true;

        return false;
    }

    public boolean sameFirstLast(int[] nums) {

        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int sum3(int[] nums) {

        int sum = nums[0] + nums[1] + nums[2];
        return sum;

    }

    public int[] maxEnd3(int[] nums) {

        int max = nums[0];

        max = nums[0];

        if (nums[2] >= max) {
            max = nums[2];
        }

        int[] maximum = {max, max, max};

        return maximum;
    }

    public int[] makeEnds(int[] nums) {

        int[] newArr = {nums[0], nums[nums.length - 1]};

        return newArr;


    }

    public int[] makeLast(int[] nums) {

        int[] longArr = new int[nums.length * 2];
        longArr[longArr.length - 1] = nums[nums.length - 1];

        return longArr;

    }

    public int start1(int[] a, int[] b) {

        int count = 0;

        if (a.length > 0 && a[0] == 1) {
            count++;
        }


        if (b.length > 0 && b[0] == 1) {
            count++;
        }


        return count;

    }

    public int[] plusTwo(int[] a, int[] b) {

        return new int[]{a[0], a[1], b[0], b[1]};

    }

    public int maxTriple(int[] nums) {

        int max = nums[0];

        if (max <= nums[nums.length - 1]) {
            max = nums[nums.length - 1];
        }
        if (max <= nums[nums.length / 2]) {
            max = nums[nums.length / 2];
        }
        return max;
    }

    public int[] make2(int[] a, int[] b) {

        int[] temp = new int[2];

        if (a.length >= 2) {
            temp[0] = a[0];
            temp[1] = a[1];
        } else if (a.length == 1) {
            temp[0] = a[0];
            temp[1] = b[0];
        } else if (a.length == 0) {
            temp[0] = b[0];
            temp[1] = b[1];

        }

        return temp;

    }

    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;

    }

    public int[] rotateLeft3(int[] nums) {

        int[] reversed = {nums[1], nums[2], nums[0]};

        return reversed;
    }

    public int sum2(int[] nums) {
        int sum = 0;
        if (nums.length >= 2) {
            sum = nums[0] + nums[1];
        } else if (nums.length == 1) {
            sum = nums[0];
        }

        return sum;
    }

    public boolean has23(int[] nums) {
        boolean contains = false;

        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) {
            contains = true;
        }

        return contains;

    }

    public boolean double23(int[] nums) {

        boolean contains = false;

        if (nums.length <= 1) {
            contains = false;
        } else if (nums.length == 2 && nums[0] == 2 &&
                nums[1] == 2 || nums[0] == 3 && nums[1] == 3) {
            contains = true;
        }


        return contains;
    }

    public int[] biggerTwo(int[] a, int[] b) {

        int suma = a[0] + a[1];
        int sumb = b[0] + b[1];

        if (suma > sumb) {
            return a;
        } else if (sumb > suma) {
            return b;
        } else {
            return a;
        }
    }

    public int[] swapEnds(int[] nums) {

        int[] arr = new int[1];

        arr[0] = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = arr[0];

        return nums;


    }

    public int[] frontPiece(int[] nums) {

        int[] arr = new int[2];

        if (nums.length > 2) {
            arr[0] = nums[0];
            arr[1] = nums[1];
        } else if (nums.length == 1) {
            arr = new int[1];
            arr[0] = nums[0];
        } else {
            arr = nums;
        }

        return arr;

    }

    public int[] front11(int[] a, int[] b) {


        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            return new int[]{a[0]};
        } else if (b.length > 0) {
            return new int[]{b[0]};
        }

        return new int[0];
    }
}
