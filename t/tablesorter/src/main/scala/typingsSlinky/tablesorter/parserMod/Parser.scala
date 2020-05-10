package typingsSlinky.tablesorter.parserMod

import typingsSlinky.tablesorter.parserTypeMod.ParserType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parser[TElement] extends js.Object {
  /**
    * The id of the parser.
    */
  var id: String = js.native
  /**
    * A value indicating whether the tablesorter should use parsed text for searching.
    */
  var parsed: Boolean = js.native
  /**
    * The type of the parser.
    */
  var `type`: ParserType = js.native
  /**
    * Formats the text of a cell.
    *
    * @param text
    * The text to format.
    *
    * @param table
    * The table which is being processed.
    *
    * @return
    * The formatted text.
    */
  def format(text: String, table: TElement): String = js.native
  /**
    * Checks whether a text is applicable to the parser.
    *
    * @param text
    * The text to check.
    *
    * @returns
    * A value indicating whether the parser is applicable to the `text`.
    */
  def is(text: String): Boolean = js.native
}

object Parser {
  @scala.inline
  def apply[TElement](
    format: (String, TElement) => String,
    id: String,
    is: String => Boolean,
    parsed: Boolean,
    `type`: ParserType
  ): Parser[TElement] = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), id = id.asInstanceOf[js.Any], is = js.Any.fromFunction1(is), parsed = parsed.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parser[TElement]]
  }
  @scala.inline
  implicit class ParserOps[Self[telement] <: Parser[telement], TElement] (val x: Self[TElement]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TElement] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TElement]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TElement] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TElement] with Other]
    @scala.inline
    def withFormat(value: (String, TElement) => String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withId(value: String): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIs(value: String => Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParsed(value: Boolean): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ParserType): Self[TElement] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

