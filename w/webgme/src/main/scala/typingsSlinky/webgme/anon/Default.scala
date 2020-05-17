package typingsSlinky.webgme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Default extends js.Object {
  /**
    * Array of base paths for the layouts.
    *  basePaths = ['../src/client/js/Layouts']
    * 
    * @type {string[]}
    */
  var basePaths: js.Array[String] = js.native
  /**
    * default = 'DefaultLayout'
    */
  var default: String = js.native
}

object Default {
  @scala.inline
  def apply(basePaths: js.Array[String], default: String): Default = {
    val __obj = js.Dynamic.literal(basePaths = basePaths.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  @scala.inline
  implicit class DefaultOps[Self <: Default] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePaths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefault(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("default")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

