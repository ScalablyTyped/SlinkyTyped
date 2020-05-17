package typingsSlinky.yargs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictargName
  extends /** All remaining options */
/* argName */ StringDictionary[js.Any] {
  /** The script name or node command */
  @JSName("$0")
  var $0: java.lang.String = js.native
  /** Non-option arguments */
  @JSName("_")
  var _underscore: js.Array[java.lang.String] = js.native
}

object DictargName {
  @scala.inline
  def apply($0: java.lang.String, _underscore: js.Array[java.lang.String]): DictargName = {
    val __obj = js.Dynamic.literal($0 = $0.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictargName]
  }
  @scala.inline
  implicit class DictargNameOps[Self <: DictargName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$0(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_underscore(value: js.Array[java.lang.String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

