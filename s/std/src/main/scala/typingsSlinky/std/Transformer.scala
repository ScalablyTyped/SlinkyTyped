package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transformer[I, O] extends js.Object {
  var flush: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.native
  var readableType: js.UndefOr[scala.Nothing] = js.native
  var start: js.UndefOr[TransformStreamDefaultControllerCallback[O]] = js.native
  var transform: js.UndefOr[TransformStreamDefaultControllerTransformCallback[I, O]] = js.native
  var writableType: js.UndefOr[scala.Nothing] = js.native
}

object Transformer {
  @scala.inline
  def apply[I, O](): Transformer[I, O] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transformer[I, O]]
  }
  @scala.inline
  implicit class TransformerOps[Self[i, o] <: Transformer[i, o], I, O] (val x: Self[I, O]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I, O] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I, O]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[I, O]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[I, O]) with Other]
    @scala.inline
    def withFlush(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFlush: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flush")(js.undefined)
        ret
    }
    @scala.inline
    def withReadableType(value: scala.Nothing): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadableType: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readableType")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: /* controller */ TransformStreamDefaultController[O] => Unit | js.Thenable[Unit]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutStart: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (I, /* controller */ TransformStreamDefaultController[O]) => Unit | js.Thenable[Unit]): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withWritableType(value: scala.Nothing): Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWritableType: Self[I, O] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("writableType")(js.undefined)
        ret
    }
  }
  
}

