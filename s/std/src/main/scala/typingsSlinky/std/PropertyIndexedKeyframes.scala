package typingsSlinky.std

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertyIndexedKeyframes
  extends /* property */ StringDictionary[
      js.UndefOr[java.lang.String | (js.Array[Double | Null | java.lang.String]) | Double | Null]
    ] {
  var composite: js.UndefOr[CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]] = js.native
  var easing: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.native
  var offset: js.UndefOr[Double | (js.Array[Double | Null])] = js.native
}

object PropertyIndexedKeyframes {
  @scala.inline
  def apply(): PropertyIndexedKeyframes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyIndexedKeyframes]
  }
  @scala.inline
  implicit class PropertyIndexedKeyframesOps[Self <: PropertyIndexedKeyframes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposite(value: CompositeOperationOrAuto | js.Array[CompositeOperationOrAuto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComposite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composite")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: java.lang.String | js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: Double | (js.Array[Double | Null])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
  }
  
}

