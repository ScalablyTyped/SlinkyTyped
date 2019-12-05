package typingsSlinky.sugar.sugarjs.Array

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.std.ArrayLike
import typingsSlinky.sugar.sugarjs.SugarNamespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constructor
  extends SugarNamespace
     with Instantiable0[Chainable[js.Object, typingsSlinky.sugar.Array[js.Object]]]
     with Instantiable2[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      /* clone */ Boolean, 
      Chainable[js.Object, typingsSlinky.sugar.Array[js.Object]]
    ]
     with Instantiable1[
      (/* obj */ ArrayLike[js.Object]) | (/* obj */ Double), 
      Chainable[js.Object, typingsSlinky.sugar.Array[js.Object]]
    ] {
  def apply[T](): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def apply[T](obj: Double): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def apply[T](obj: Double, clone: Boolean): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T]): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def apply[T](obj: ArrayLike[T], clone: Boolean): Chainable[T, typingsSlinky.sugar.Array[T]] = js.native
  def add[T](instance: typingsSlinky.sugar.Array[T], item: T): typingsSlinky.sugar.Array[T] = js.native
  def add[T](instance: typingsSlinky.sugar.Array[T], item: T, index: Double): typingsSlinky.sugar.Array[T] = js.native
  def add[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def add[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T], index: Double): typingsSlinky.sugar.Array[T] = js.native
  def append[T](instance: typingsSlinky.sugar.Array[T], item: T): typingsSlinky.sugar.Array[T] = js.native
  def append[T](instance: typingsSlinky.sugar.Array[T], item: T, index: Double): typingsSlinky.sugar.Array[T] = js.native
  def append[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def append[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T], index: Double): typingsSlinky.sugar.Array[T] = js.native
  def at[T](instance: typingsSlinky.sugar.Array[T], index: Double): T = js.native
  def at[T](instance: typingsSlinky.sugar.Array[T], index: Double, loop: Boolean): T = js.native
  def at[T](instance: typingsSlinky.sugar.Array[T], index: typingsSlinky.sugar.Array[Double]): T = js.native
  def at[T](instance: typingsSlinky.sugar.Array[T], index: typingsSlinky.sugar.Array[Double], loop: Boolean): T = js.native
  def average[T, U](instance: typingsSlinky.sugar.Array[T]): Double = js.native
  def average[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): Double = js.native
  def average[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def clone[T](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def compact[T](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def compact[T](instance: typingsSlinky.sugar.Array[T], all: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def construct[T](n: Double, indexMapFn: js.Function1[/* i */ Double, T]): typingsSlinky.sugar.Array[T] = js.native
  def count[T](instance: typingsSlinky.sugar.Array[T], search: T): Double = js.native
  def count[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): Double = js.native
  def count[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): Double = js.native
  def count[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def create[T](): typingsSlinky.sugar.Array[T] = js.native
  def create[T](obj: Double): typingsSlinky.sugar.Array[T] = js.native
  def create[T](obj: Double, clone: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def create[T](obj: ArrayLike[T]): typingsSlinky.sugar.Array[T] = js.native
  def create[T](obj: ArrayLike[T], clone: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def every[T](instance: typingsSlinky.sugar.Array[T], search: T): Boolean = js.native
  def every[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def every[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def every[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def everyFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def everyFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def everyFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def exclude[T](instance: typingsSlinky.sugar.Array[T], search: T): typingsSlinky.sugar.Array[T] = js.native
  def exclude[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): typingsSlinky.sugar.Array[T] = js.native
  def filter[T](instance: typingsSlinky.sugar.Array[T], search: T): typingsSlinky.sugar.Array[T] = js.native
  def filter[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): typingsSlinky.sugar.Array[T] = js.native
  def filter[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): typingsSlinky.sugar.Array[T] = js.native
  def filter[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): typingsSlinky.sugar.Array[T] = js.native
  def filterFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def filterFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def filterFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def find[T](instance: typingsSlinky.sugar.Array[T], search: T): T = js.native
  def find[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): T = js.native
  def find[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): T = js.native
  def find[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): T = js.native
  def findFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def findFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def findIndex[T](instance: typingsSlinky.sugar.Array[T], search: T): Double = js.native
  def findIndex[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): Double = js.native
  def findIndex[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): Double = js.native
  def findIndex[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): Double = js.native
  def findIndexFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def findIndexFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def findIndexFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def first[T](instance: typingsSlinky.sugar.Array[T]): T = js.native
  def first[T](instance: typingsSlinky.sugar.Array[T], num: Double): T = js.native
  def flatten[T](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def flatten[T](instance: typingsSlinky.sugar.Array[T], limit: Double): typingsSlinky.sugar.Array[T] = js.native
  def forEachFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def forEachFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def forEachFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def from[T](instance: typingsSlinky.sugar.Array[T], index: Double): typingsSlinky.sugar.Array[T] = js.native
  def getOption[T](name: java.lang.String): T = js.native
  def groupBy[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): js.Object = js.native
  def groupBy[T, U](
    instance: typingsSlinky.sugar.Array[T],
    map: java.lang.String,
    groupFn: js.Function3[
      /* arr */ typingsSlinky.sugar.Array[T], 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      Unit
    ]
  ): js.Object = js.native
  def groupBy[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): js.Object = js.native
  def groupBy[T, U](
    instance: typingsSlinky.sugar.Array[T],
    map: mapFn[T, U],
    groupFn: js.Function3[
      /* arr */ typingsSlinky.sugar.Array[T], 
      /* key */ java.lang.String, 
      /* obj */ js.Object, 
      Unit
    ]
  ): js.Object = js.native
  def inGroups[T](instance: typingsSlinky.sugar.Array[T], num: Double): typingsSlinky.sugar.Array[T] = js.native
  def inGroups[T](instance: typingsSlinky.sugar.Array[T], num: Double, padding: js.Any): typingsSlinky.sugar.Array[T] = js.native
  def inGroupsOf[T](instance: typingsSlinky.sugar.Array[T], num: Double): typingsSlinky.sugar.Array[T] = js.native
  def inGroupsOf[T](instance: typingsSlinky.sugar.Array[T], num: Double, padding: js.Any): typingsSlinky.sugar.Array[T] = js.native
  def insert[T](instance: typingsSlinky.sugar.Array[T], item: T): typingsSlinky.sugar.Array[T] = js.native
  def insert[T](instance: typingsSlinky.sugar.Array[T], item: T, index: Double): typingsSlinky.sugar.Array[T] = js.native
  def insert[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def insert[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T], index: Double): typingsSlinky.sugar.Array[T] = js.native
  def intersect[T](instance: typingsSlinky.sugar.Array[T], arr: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def isEmpty[T](instance: typingsSlinky.sugar.Array[T]): Boolean = js.native
  def isEqual[T](instance: typingsSlinky.sugar.Array[T], arr: typingsSlinky.sugar.Array[T]): Boolean = js.native
  def last[T](instance: typingsSlinky.sugar.Array[T]): T = js.native
  def last[T](instance: typingsSlinky.sugar.Array[T], num: Double): T = js.native
  def least[T, U](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def least[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def least[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: java.lang.String): typingsSlinky.sugar.Array[T] = js.native
  def least[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typingsSlinky.sugar.Array[T] = js.native
  def least[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): typingsSlinky.sugar.Array[T] = js.native
  def least[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): typingsSlinky.sugar.Array[T] = js.native
  def map[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): typingsSlinky.sugar.Array[U] = js.native
  def map[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String, context: js.Any): typingsSlinky.sugar.Array[U] = js.native
  def map[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): typingsSlinky.sugar.Array[U] = js.native
  def map[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U], context: js.Any): typingsSlinky.sugar.Array[U] = js.native
  def mapFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def mapFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def mapFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def max[T, U](instance: typingsSlinky.sugar.Array[T]): T = js.native
  def max[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean): T = js.native
  def max[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
  def max[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def max[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): T = js.native
  def max[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): T = js.native
  def median[T, U](instance: typingsSlinky.sugar.Array[T]): Double = js.native
  def median[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): Double = js.native
  def median[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def min[T, U](instance: typingsSlinky.sugar.Array[T]): T = js.native
  def min[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean): T = js.native
  def min[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: java.lang.String): T = js.native
  def min[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: mapFn[T, U]): T = js.native
  def min[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): T = js.native
  def min[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): T = js.native
  def most[T, U](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def most[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def most[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: java.lang.String): typingsSlinky.sugar.Array[T] = js.native
  def most[T, U](instance: typingsSlinky.sugar.Array[T], all: Boolean, map: mapFn[T, U]): typingsSlinky.sugar.Array[T] = js.native
  def most[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): typingsSlinky.sugar.Array[T] = js.native
  def most[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): typingsSlinky.sugar.Array[T] = js.native
  def none[T](instance: typingsSlinky.sugar.Array[T], search: T): Boolean = js.native
  def none[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def none[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def none[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def reduceFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def reduceFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def reduceRightFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def reduceRightFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def remove[T](instance: typingsSlinky.sugar.Array[T], search: T): typingsSlinky.sugar.Array[T] = js.native
  def remove[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): typingsSlinky.sugar.Array[T] = js.native
  def removeAt[T](instance: typingsSlinky.sugar.Array[T], start: Double): typingsSlinky.sugar.Array[T] = js.native
  def removeAt[T](instance: typingsSlinky.sugar.Array[T], start: Double, end: Double): typingsSlinky.sugar.Array[T] = js.native
  def sample[T](instance: typingsSlinky.sugar.Array[T]): T = js.native
  def sample[T](instance: typingsSlinky.sugar.Array[T], num: Double): T = js.native
  def sample[T](instance: typingsSlinky.sugar.Array[T], num: Double, remove: Boolean): T = js.native
  def setOption(name: java.lang.String, value: js.Any): Unit = js.native
  def setOption(options: ArrayOptions): Unit = js.native
  def shuffle[T](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def some[T](instance: typingsSlinky.sugar.Array[T], search: T): Boolean = js.native
  def some[T](instance: typingsSlinky.sugar.Array[T], search: T, context: js.Any): Boolean = js.native
  def some[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T]): Boolean = js.native
  def some[T](instance: typingsSlinky.sugar.Array[T], search: searchFn[T], context: js.Any): Boolean = js.native
  def someFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double): T = js.native
  def someFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, args: js.Any*): T = js.native
  def someFromIndex[T](instance: typingsSlinky.sugar.Array[T], startIndex: Double, loop: Boolean, args: js.Any*): T = js.native
  def sortBy[T, U](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): typingsSlinky.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String, desc: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsSlinky.sugar.Array[T], map: sortMapFn[T, U]): typingsSlinky.sugar.Array[T] = js.native
  def sortBy[T, U](instance: typingsSlinky.sugar.Array[T], map: sortMapFn[T, U], desc: Boolean): typingsSlinky.sugar.Array[T] = js.native
  def subtract[T](instance: typingsSlinky.sugar.Array[T], item: T): typingsSlinky.sugar.Array[T] = js.native
  def subtract[T](instance: typingsSlinky.sugar.Array[T], item: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def sum[T, U](instance: typingsSlinky.sugar.Array[T]): Double = js.native
  def sum[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): Double = js.native
  def sum[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): Double = js.native
  def to[T](instance: typingsSlinky.sugar.Array[T], index: Double): typingsSlinky.sugar.Array[T] = js.native
  def union[T](instance: typingsSlinky.sugar.Array[T], arr: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def unique[T, U](instance: typingsSlinky.sugar.Array[T]): typingsSlinky.sugar.Array[T] = js.native
  def unique[T, U](instance: typingsSlinky.sugar.Array[T], map: java.lang.String): typingsSlinky.sugar.Array[T] = js.native
  def unique[T, U](instance: typingsSlinky.sugar.Array[T], map: mapFn[T, U]): typingsSlinky.sugar.Array[T] = js.native
  def zip[T](instance: typingsSlinky.sugar.Array[T], args: js.Any*): typingsSlinky.sugar.Array[T] = js.native
}

