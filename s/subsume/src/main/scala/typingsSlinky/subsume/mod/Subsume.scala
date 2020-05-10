package typingsSlinky.subsume.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subsume extends js.Object {
  /**
  	Used identifier.
  	*/
  var id: String = js.native
  /**
  	Postfix used in `.compose()`.
  	*/
  var postfix: String = js.native
  /**
  	Prefix used in `.compose()`.
  	*/
  var prefix: String = js.native
  /**
  	Regex used in `.parse()`.
  	*/
  var regex: js.RegExp = js.native
  /**
  	@returns A wrapped version of `text` that you can embed in other content.
  	*/
  def compose(string: String): String = js.native
  /**
  	Extract your embedded data from `text`.
  	@returns An object with properties `.data` for your embedded data and `.rest` for everything else.
  	*/
  def parse(string: String): ParseResult = js.native
}

object Subsume {
  @scala.inline
  def apply(
    compose: String => String,
    id: String,
    parse: String => ParseResult,
    postfix: String,
    prefix: String,
    regex: js.RegExp
  ): Subsume = {
    val __obj = js.Dynamic.literal(compose = js.Any.fromFunction1(compose), id = id.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse), postfix = postfix.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subsume]
  }
  @scala.inline
  implicit class SubsumeOps[Self <: Subsume] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompose(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: String => ParseResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPostfix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postfix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegex(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regex")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

