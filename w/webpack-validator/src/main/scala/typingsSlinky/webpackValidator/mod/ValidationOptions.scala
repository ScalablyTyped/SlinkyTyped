package typingsSlinky.webpackValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationOptions extends js.Object {
  var `loader-enforce-include-or-exclude`: js.UndefOr[Boolean] = js.native
  var `loader-prefer-include`: js.UndefOr[Boolean] = js.native
  var `no-root-files-node-modules-nameclash`: js.UndefOr[Boolean] = js.native
}

object ValidationOptions {
  @scala.inline
  def apply(): ValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidationOptions]
  }
  @scala.inline
  implicit class ValidationOptionsOps[Self <: ValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withLoader-enforce-include-or-exclude`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader-enforce-include-or-exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLoader-enforce-include-or-exclude`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader-enforce-include-or-exclude")(js.undefined)
        ret
    }
    @scala.inline
    def `withLoader-prefer-include`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader-prefer-include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutLoader-prefer-include`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loader-prefer-include")(js.undefined)
        ret
    }
    @scala.inline
    def `withNo-root-files-node-modules-nameclash`(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-root-files-node-modules-nameclash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutNo-root-files-node-modules-nameclash`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("no-root-files-node-modules-nameclash")(js.undefined)
        ret
    }
  }
  
}

