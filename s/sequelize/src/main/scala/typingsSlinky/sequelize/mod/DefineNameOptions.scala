package typingsSlinky.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for name property in DefineOptions
  *
  * @see DefineOptions
  */
@js.native
trait DefineNameOptions extends js.Object {
  /**
    * Plural model name
    */
  var plural: js.UndefOr[String] = js.native
  /**
    * Singular model name
    */
  var singular: js.UndefOr[String] = js.native
}

object DefineNameOptions {
  @scala.inline
  def apply(): DefineNameOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefineNameOptions]
  }
  @scala.inline
  implicit class DefineNameOptionsOps[Self <: DefineNameOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlural(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlural: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plural")(js.undefined)
        ret
    }
    @scala.inline
    def withSingular(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singular")(js.undefined)
        ret
    }
  }
  
}

