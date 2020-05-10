package typingsSlinky.typedoc.browserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignatureReflectionContainer[TParameters] extends js.Object {
  var implementationOf: js.UndefOr[TypeObject] = js.native
  var inheritedFrom: js.UndefOr[TypeObject] = js.native
  var overwrites: js.UndefOr[TypeObject] = js.native
  var parameters: js.UndefOr[js.Array[TParameters]] = js.native
}

object SignatureReflectionContainer {
  @scala.inline
  def apply[TParameters](): SignatureReflectionContainer[TParameters] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SignatureReflectionContainer[TParameters]]
  }
  @scala.inline
  implicit class SignatureReflectionContainerOps[Self[tparameters] <: SignatureReflectionContainer[tparameters], TParameters] (val x: Self[TParameters]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TParameters] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TParameters]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TParameters] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TParameters] with Other]
    @scala.inline
    def withImplementationOf(value: TypeObject): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationOf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImplementationOf: Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("implementationOf")(js.undefined)
        ret
    }
    @scala.inline
    def withInheritedFrom(value: TypeObject): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInheritedFrom: Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inheritedFrom")(js.undefined)
        ret
    }
    @scala.inline
    def withOverwrites(value: TypeObject): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverwrites: Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overwrites")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: js.Array[TParameters]): Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self[TParameters] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parameters")(js.undefined)
        ret
    }
  }
  
}

