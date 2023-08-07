//bubble sort

function bubblesort(arr){
    for(let i=0;i<arr.length-1;i++){
        let swap =false;
        for(let j=0;j<arr.length-i-1;j++){
            if(arr[j]>arr[j+1]){
                let temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap=true;
            }
        }
        if(swap==false){
            break
        }
    }
    return arr;
}



// insertion sort

function insertionSort(arr){
    for(let i=1;i<arr.length;i++){
        let val = arr[i];
        let j =i-1;
        while(j>=0 && arr[j]>val){
            arr[j+1] = arr[j]
            j--;
        }
        arr[j+1] =val
    }
    return arr;
}



// selection sort
function selectionSort(arr){
    for(let i=0;i<arr.length-1;i++){
        let small = i;
        for(let j=i+1; j<arr.length; j++){
            if(arr[small]>arr[j]){
                small=j;
            }
        }  
        let temp = arr[i];
        arr[i] = arr[small];
        arr[small]=temp;
    }
    return arr;
}


// Quick sort

function quickSort(arr){
    if(arr.length<=1){
        return arr;
    }
    let pt = arr[arr.length-1];
    let small =[];
    let large =[];
    for(let i =0;i<arr.length-1;i++){
        if(arr[i]< pt){
            small.push(arr[i])
        } else{
            large.push(arr[i])
        }
    }
    return [...quickSort(small), pt ,...quickSort(large)]
}



//merge sort

function mergeSort(arr, l,r){
if(l>=r){
    return;
}
let m = l+parseInt((r-l)/2)
mergeSort(arr, l,m)
mergeSort(arr, m+1,r)
merge(arr,l,m,r)
return arr
}

function merge(arr, l,m,r){
    let lSize= m-l+1;
    let rSize = r-m;
    var lArr=new Array(lSize)
    let rArr=new Array(rSize)
    for(let i=0;i<lSize;i++){
        lArr[i]=arr[l+i];
    }
    for(let i=0;i<rSize;i++){
        rArr[i]=arr[m+1+i];
    }
let i=0;
let j=0;
let k=l;

while(i<lSize && j<rSize){
    if(lArr[i]<rArr[j]){
        arr[k] =lArr[i];
        i++;
    } else{
        arr[k]= rArr[j];
        j++;
    }
    k++;
    while(i<lSize){
        arr[k]=lArr[i];
        k++;
        i++;
    }
    while(j<rSize){
        arr[k]=rArr[j];
        k++;
        j++
    }
}

}


let arr = [5,7,3,6,4,2];
console.log(mergeSort(arr,0,5))