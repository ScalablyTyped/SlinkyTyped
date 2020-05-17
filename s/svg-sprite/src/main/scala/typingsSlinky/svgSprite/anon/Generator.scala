package typingsSlinky.svgSprite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Generator extends js.Object {
  /**
    * SVG shape ID generator callback
    */
  var generator: js.UndefOr[String | (js.Function1[/* svg */ String, String])] = js.native
  /**
    * File name separator for shape states (e.g. ':hover')
    */
  var pseudo: js.UndefOr[String] = js.native
  /**
    * Separator for directory name traversal
    */
  var separator: js.UndefOr[String] = js.native
  /**
    * Whitespace replacement for shape IDs
    */
  var whitespace: js.UndefOr[String] = js.native
}

object Generator {
  @scala.inline
  def apply(): Generator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Generator]
  }
  @scala.inline
  implicit class GeneratorOps[Self <: Generator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeneratorFunction1(value: /* svg */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGenerator(value: String | (js.Function1[/* svg */ String, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenerator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generator")(js.undefined)
        ret
    }
    @scala.inline
    def withPseudo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPseudo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pseudo")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitespace")(js.undefined)
        ret
    }
  }
  
}

