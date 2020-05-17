package typingsSlinky.streamjs

import typingsSlinky.streamjs.Stream.Accumulator
import typingsSlinky.streamjs.Stream.Collector
import typingsSlinky.streamjs.Stream.Comparator
import typingsSlinky.streamjs.Stream.Consumer
import typingsSlinky.streamjs.Stream.Function
import typingsSlinky.streamjs.Stream.GroupingResult
import typingsSlinky.streamjs.Stream.Iterator
import typingsSlinky.streamjs.Stream.JoinOptions
import typingsSlinky.streamjs.Stream.Map
import typingsSlinky.streamjs.Stream.Optional
import typingsSlinky.streamjs.Stream.Predicate
import typingsSlinky.streamjs.Stream.Sample
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream_[T] extends js.Object {
  def allMatch(predicate: Predicate[T]): Boolean = js.native
  def allMatch(regexp: js.RegExp): Boolean = js.native
  def allMatch(sample: Sample): Boolean = js.native
  def anyMatch(predicate: Predicate[T]): Boolean = js.native
  def anyMatch(regexp: js.RegExp): Boolean = js.native
  def anyMatch(sample: Sample): Boolean = js.native
  def average(): Double = js.native
  def average(path: String): Double = js.native
  def avg(): Double = js.native
  def avg(path: String): Double = js.native
  def collect(collector: Collector[T]): T = js.native
  def count(): Double = js.native
  def distinct(): Stream[T] = js.native
  def dropWhile(predicate: Predicate[T]): Stream[T] = js.native
  def dropWhile(regexp: js.RegExp): Stream[String] = js.native
  def dropWhile(sample: Sample): Stream[T] = js.native
  def each(consumer: Consumer[T]): Unit = js.native
  def filter(predicate: Predicate[T]): Stream[T] = js.native
  def filter(regexp: js.RegExp): Stream[String] = js.native
  def filter(sample: Sample): Stream[T] = js.native
  def findAny(): Optional[T] = js.native
  def findFirst(): Optional[T] = js.native
  def flatMap[U](mapper: Function[T, js.Array[U]]): Stream[U] = js.native
  def forEach(consumer: Consumer[T]): Unit = js.native
  def groupBy(mapper: Function[T, String]): GroupingResult[T] = js.native
  def groupBy(path: String): GroupingResult[T] = js.native
  def groupingBy(mapper: Function[T, String]): GroupingResult[T] = js.native
  def groupingBy(path: String): GroupingResult[T] = js.native
  def indexBy(keyMapper: Function[T, String]): Map[T] = js.native
  def indexBy(keyMapper: Function[T, String], mergeFunction: Accumulator[T]): Map[T] = js.native
  def iterator(): Iterator[T] = js.native
  def join(): String = js.native
  def join(delimiter: String): String = js.native
  def join(options: JoinOptions): String = js.native
  def joining(): String = js.native
  def joining(delimiter: String): String = js.native
  def joining(options: JoinOptions): String = js.native
  def limit(limit: Double): Stream[T] = js.native
  def map[U](mapper: Function[T, U]): Stream[U] = js.native
  def max(): Optional[T] = js.native
  def max(comparator: Comparator[T]): Optional[T] = js.native
  def max(path: String): Optional[T] = js.native
  def min(): Optional[T] = js.native
  def min(comparator: Comparator[T]): Optional[T] = js.native
  def min(path: String): Optional[T] = js.native
  def noneMatch(predicate: js.Function1[/* elem */ T, Boolean]): Boolean = js.native
  def noneMatch(regexp: js.RegExp): Boolean = js.native
  def partitionBy(predicate: Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitionBy(regexp: js.RegExp): js.Array[js.Array[T]] = js.native
  def partitionBy(sample: Sample): js.Array[js.Array[T]] = js.native
  def partitionBy(size: Double): js.Array[js.Array[T]] = js.native
  def partitioningBy(predicate: Predicate[T]): js.Array[js.Array[T]] = js.native
  def partitioningBy(regexp: js.RegExp): js.Array[js.Array[T]] = js.native
  def partitioningBy(sample: Sample): js.Array[js.Array[T]] = js.native
  def partitioningBy(size: Double): js.Array[js.Array[T]] = js.native
  def peek(consumer: Consumer[T]): Stream[T] = js.native
  def reduce(accumulator: Accumulator[T]): Optional[T] = js.native
  def reduce(identity: T, accumulator: Accumulator[T]): T = js.native
  def reverse(): Stream[T] = js.native
  def shuffle(): Stream[T] = js.native
  def size(): Double = js.native
  def skip(n: Double): Stream[T] = js.native
  def slice(begin: Double, end: Double): Stream[T] = js.native
  def sort(): Stream[T] = js.native
  def sort(comparator: Comparator[T]): Stream[T] = js.native
  def sort(path: String): Stream[T] = js.native
  def sorted(): Stream[T] = js.native
  def sorted(comparator: Comparator[T]): Stream[T] = js.native
  def sorted(path: String): Stream[T] = js.native
  def sum(): Double = js.native
  def sum(path: String): Double = js.native
  def takeWhile(predicate: Predicate[T]): Stream[T] = js.native
  def takeWhile(regexp: js.RegExp): Stream[String] = js.native
  def takeWhile(sample: Sample): Stream[T] = js.native
  def toArray(): js.Array[T] = js.native
  def toList(): js.Array[T] = js.native
  def toMap(keyMapper: Function[T, String]): Map[T] = js.native
  def toMap(keyMapper: Function[T, String], mergeFunction: Accumulator[T]): Map[T] = js.native
  def toMap(path: String): Map[T] = js.native
  def toMap(path: String, mergeFunction: Accumulator[T]): Map[T] = js.native
}

