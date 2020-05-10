package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTransformers extends js.Object {
  /** Custom transformers to evaluate after built-in .js transformations. */
  var after: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.native
  /** Custom transformers to evaluate after built-in .d.ts transformations. */
  var afterDeclarations: js.UndefOr[js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]] = js.native
  /** Custom transformers to evaluate before built-in .js transformations. */
  var before: js.UndefOr[js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]] = js.native
}

object CustomTransformers {
  @scala.inline
  def apply(): CustomTransformers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTransformers]
  }
  @scala.inline
  implicit class CustomTransformersOps[Self <: CustomTransformers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfter(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("after")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterDeclarations(value: js.Array[(TransformerFactory[Bundle | SourceFile]) | CustomTransformerFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeclarations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAfterDeclarations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterDeclarations")(js.undefined)
        ret
    }
    @scala.inline
    def withBefore(value: js.Array[TransformerFactory[SourceFile] | CustomTransformerFactory]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBefore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("before")(js.undefined)
        ret
    }
  }
  
}

