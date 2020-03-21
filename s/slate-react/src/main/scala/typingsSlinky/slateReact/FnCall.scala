package typingsSlinky.slateReact

import typingsSlinky.slate.mod.Annotation
import typingsSlinky.slate.mod.AnnotationJSON
import typingsSlinky.slate.mod.AnnotationProperties
import typingsSlinky.slate.mod.Controller
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(annotation: Annotation): Controller = js.native
  def apply(annotation: AnnotationJSON): Controller = js.native
  def apply(annotation: AnnotationProperties): Controller = js.native
}

