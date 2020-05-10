package typingsSlinky.vara.mod

import org.scalajs.dom.raw.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextElements extends js.Object {
  /**
    * Array of svg g elements, each representing a letter
    */
  var characters: js.Array[SVGGElement] = js.native
  /**
    * Svg g wrapping the text block
    */
  var container: SVGGElement = js.native
}

object TextElements {
  @scala.inline
  def apply(characters: js.Array[SVGGElement], container: SVGGElement): TextElements = {
    val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextElements]
  }
  @scala.inline
  implicit class TextElementsOps[Self <: TextElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCharacters(value: js.Array[SVGGElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("characters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: SVGGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

