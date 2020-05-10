package typingsSlinky.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTransformer extends js.Object {
  def transformBundle(node: Bundle): Bundle = js.native
  def transformSourceFile(node: SourceFile): SourceFile = js.native
}

object CustomTransformer {
  @scala.inline
  def apply(transformBundle: Bundle => Bundle, transformSourceFile: SourceFile => SourceFile): CustomTransformer = {
    val __obj = js.Dynamic.literal(transformBundle = js.Any.fromFunction1(transformBundle), transformSourceFile = js.Any.fromFunction1(transformSourceFile))
    __obj.asInstanceOf[CustomTransformer]
  }
  @scala.inline
  implicit class CustomTransformerOps[Self <: CustomTransformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformBundle(value: Bundle => Bundle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformBundle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTransformSourceFile(value: SourceFile => SourceFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformSourceFile")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

