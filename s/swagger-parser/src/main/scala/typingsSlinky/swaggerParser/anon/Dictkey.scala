package typingsSlinky.swaggerParser.anon

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.swaggerParser.mod.ParserOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictkey
  extends /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
  var json: js.UndefOr[ParserOptions | Boolean] = js.native
  var text: js.UndefOr[ParserOptionsencodingstri | Boolean] = js.native
  var yaml: js.UndefOr[ParserOptions | Boolean] = js.native
}

object Dictkey {
  @scala.inline
  def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  @scala.inline
  implicit class DictkeyOps[Self <: Dictkey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withJson(value: ParserOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJson: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("json")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: ParserOptionsencodingstri | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withYaml(value: ParserOptions | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYaml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yaml")(js.undefined)
        ret
    }
  }
  
}

