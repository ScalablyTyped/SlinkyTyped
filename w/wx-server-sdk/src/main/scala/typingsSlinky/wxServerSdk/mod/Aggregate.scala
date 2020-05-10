package typingsSlinky.wxServerSdk.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.wxServerSdk.AnonBoundaries
import typingsSlinky.wxServerSdk.AnonBuckets
import typingsSlinky.wxServerSdk.AnonDictfieldName
import typingsSlinky.wxServerSdk.AnonDistanceField
import typingsSlinky.wxServerSdk.AnonIncludeArrayIndex
import typingsSlinky.wxServerSdk.AnonNewRoot
import typingsSlinky.wxServerSdk.AnonSize
import typingsSlinky.wxServerSdk.wxServerSdkNumbers.`-1`
import typingsSlinky.wxServerSdk.wxServerSdkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Aggregate extends js.Object {
  def addFields(fieldObj: StringDictionary[js.Any]): Aggregate = js.native
  def bucket(bucketObj: AnonBoundaries): Aggregate = js.native
  def bucketAuto(bucketObj: AnonBuckets): Aggregate = js.native
  def count(expr: String): js.Any = js.native
  def end(): Unit = js.native
  def geoNear(geoNearObj: AnonDistanceField): Aggregate = js.native
  def group(groupObj: AnonDictfieldName): Aggregate = js.native
  def limit(limitRecords: Double): js.Any = js.native
  def `match`(matchObj: StringDictionary[js.Any]): Aggregate = js.native
  def project(projectObj: StringDictionary[js.Any]): Aggregate = js.native
  def replaceRoot(replaceRootObj: AnonNewRoot): Aggregate = js.native
  def sample(replaceRootObj: AnonSize): Aggregate = js.native
  def skip(skipNum: Double): js.Any = js.native
  def sort(replaceRootObj: StringDictionary[`1` | `-1`]): Aggregate = js.native
  def sortByCount(fieldName: String): Aggregate = js.native
  def unwind(unwindObj: AnonIncludeArrayIndex): Aggregate = js.native
}

object Aggregate {
  @scala.inline
  def apply(
    addFields: StringDictionary[js.Any] => Aggregate,
    bucket: AnonBoundaries => Aggregate,
    bucketAuto: AnonBuckets => Aggregate,
    count: String => js.Any,
    end: () => Unit,
    geoNear: AnonDistanceField => Aggregate,
    group: AnonDictfieldName => Aggregate,
    limit: Double => js.Any,
    `match`: StringDictionary[js.Any] => Aggregate,
    project: StringDictionary[js.Any] => Aggregate,
    replaceRoot: AnonNewRoot => Aggregate,
    sample: AnonSize => Aggregate,
    skip: Double => js.Any,
    sort: StringDictionary[`1` | `-1`] => Aggregate,
    sortByCount: String => Aggregate,
    unwind: AnonIncludeArrayIndex => Aggregate
  ): Aggregate = {
    val __obj = js.Dynamic.literal(addFields = js.Any.fromFunction1(addFields), bucket = js.Any.fromFunction1(bucket), bucketAuto = js.Any.fromFunction1(bucketAuto), count = js.Any.fromFunction1(count), end = js.Any.fromFunction0(end), geoNear = js.Any.fromFunction1(geoNear), group = js.Any.fromFunction1(group), limit = js.Any.fromFunction1(limit), project = js.Any.fromFunction1(project), replaceRoot = js.Any.fromFunction1(replaceRoot), sample = js.Any.fromFunction1(sample), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort), sortByCount = js.Any.fromFunction1(sortByCount), unwind = js.Any.fromFunction1(unwind))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Aggregate]
  }
  @scala.inline
  implicit class AggregateOps[Self <: Aggregate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddFields(value: StringDictionary[js.Any] => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFields")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBucket(value: AnonBoundaries => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucket")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBucketAuto(value: AnonBuckets => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketAuto")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: String => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEnd(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGeoNear(value: AnonDistanceField => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoNear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGroup(value: AnonDictfieldName => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMatch(value: StringDictionary[js.Any] => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("match")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProject(value: StringDictionary[js.Any] => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withReplaceRoot(value: AnonNewRoot => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceRoot")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSample(value: AnonSize => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSkip(value: Double => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: StringDictionary[`1` | `-1`] => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSortByCount(value: String => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortByCount")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUnwind(value: AnonIncludeArrayIndex => Aggregate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwind")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

