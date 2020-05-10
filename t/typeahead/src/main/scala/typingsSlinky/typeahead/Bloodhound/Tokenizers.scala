package typingsSlinky.typeahead.Bloodhound

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Build-in tokenization methods.
  */
@js.native
trait Tokenizers extends js.Object {
  /**
    * Instances of the build-in tokenization methods.
    */
  var obj: ObjTokenizer = js.native
  /**
    * Split a given string on non-word characters.
    */
  def nonword(str: String): js.Array[String] = js.native
  /**
    * Split a given string on whitespace characters.
    */
  def whitespace(str: String): js.Array[String] = js.native
}

object Tokenizers {
  @scala.inline
  def apply(nonword: String => js.Array[String], obj: ObjTokenizer, whitespace: String => js.Array[String]): Tokenizers = {
    val __obj = js.Dynamic.literal(nonword = js.Any.fromFunction1(nonword), obj = obj.asInstanceOf[js.Any], whitespace = js.Any.fromFunction1(whitespace))
    __obj.asInstanceOf[Tokenizers]
  }
  @scala.inline
  implicit class TokenizersOps[Self <: Tokenizers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonword(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonword")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withObj(value: ObjTokenizer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obj")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWhitespace(value: String => js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

