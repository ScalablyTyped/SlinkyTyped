package typingsSlinky.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallOptions extends js.Object {
  /**
    * whether to run `bower install` or can be options to pass to `dargs` as arguments
    */
  var bower: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * whether to run `npm install` or can be options to pass to `dargs` as arguments
    */
  var npm: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * whether to log the used commands
    */
  var skipMessage: js.UndefOr[Boolean] = js.native
  /**
    * whether to run `yarn install` or can be options to pass to `dargs` as arguments
    */
  var yarn: js.UndefOr[Boolean | js.Object] = js.native
}

object InstallOptions {
  @scala.inline
  def apply(): InstallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallOptions]
  }
  @scala.inline
  implicit class InstallOptionsOps[Self <: InstallOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBower(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bower")(js.undefined)
        ret
    }
    @scala.inline
    def withNpm(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNpm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("npm")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipMessage(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withYarn(value: Boolean | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYarn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yarn")(js.undefined)
        ret
    }
  }
  
}

