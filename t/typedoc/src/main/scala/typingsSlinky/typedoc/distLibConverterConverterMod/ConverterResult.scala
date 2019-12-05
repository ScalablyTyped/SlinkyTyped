package typingsSlinky.typedoc.distLibConverterConverterMod

import typingsSlinky.typedoc.distLibModelsMod.ProjectReflection
import typingsSlinky.typescript.typescriptMod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConverterResult extends js.Object {
  var errors: js.Array[Diagnostic]
  var project: ProjectReflection
}

object ConverterResult {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], project: ProjectReflection): ConverterResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ConverterResult]
  }
}

