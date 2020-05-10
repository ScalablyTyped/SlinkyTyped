package typingsSlinky.typedoc.converterConverterMod

import typingsSlinky.typedoc.modelsMod.ProjectReflection
import typingsSlinky.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConverterResult extends js.Object {
  var errors: js.Array[Diagnostic] = js.native
  var project: ProjectReflection = js.native
}

object ConverterResult {
  @scala.inline
  def apply(errors: js.Array[Diagnostic], project: ProjectReflection): ConverterResult = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConverterResult]
  }
  @scala.inline
  implicit class ConverterResultOps[Self <: ConverterResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrors(value: js.Array[Diagnostic]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProject(value: ProjectReflection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("project")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

