package typingsSlinky.zipkin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAnnotation extends js.Object {
  val annotationType: String = js.native
}

object IAnnotation {
  @scala.inline
  def apply(annotationType: String): IAnnotation = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnnotation]
  }
  @scala.inline
  implicit class IAnnotationOps[Self <: IAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotationType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("annotationType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

