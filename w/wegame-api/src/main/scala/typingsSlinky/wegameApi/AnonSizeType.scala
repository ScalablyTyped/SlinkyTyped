package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wegameApiStrings.album
import typingsSlinky.wegameApi.wegameApiStrings.camera
import typingsSlinky.wegameApi.wegameApiStrings.compressed
import typingsSlinky.wegameApi.wegameApiStrings.original
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSizeType extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var count: Double = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 所选的图片的尺寸
    */
  var sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]) = js.native
  /**
    * 选择图片的来源
    */
  var sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera]) = js.native
  var success: js.UndefOr[js.Function1[/* res */ AnonTempFilePaths, Unit]] = js.native
}

object AnonSizeType {
  @scala.inline
  def apply(
    count: Double,
    sizeType: (js.Array[original | compressed]) | (js.Tuple2[original, compressed]),
    sourceType: (js.Array[album | camera]) | (js.Tuple2[album, camera])
  ): AnonSizeType = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], sizeType = sizeType.asInstanceOf[js.Any], sourceType = sourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSizeType]
  }
  @scala.inline
  implicit class AnonSizeTypeOps[Self <: AnonSizeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeType(value: (js.Array[original | compressed]) | (js.Tuple2[original, compressed])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSourceType(value: (js.Array[album | camera]) | (js.Tuple2[album, camera])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
        ret
    }
    @scala.inline
    def withFail(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutFail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fail")(js.undefined)
        ret
    }
    @scala.inline
    def withSuccess(value: /* res */ AnonTempFilePaths => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

