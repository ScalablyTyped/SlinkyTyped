package typingsSlinky.wordpressBlocks.anon

import typingsSlinky.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.accessKey
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.accessKeyLabel
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.autocapitalize
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.dir
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.draggable
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.hidden
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.innerText
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.lang
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.offsetHeight
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.offsetLeft
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.offsetParent
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.offsetTop
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.offsetWidth
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.spellcheck
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.title
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.translate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Children extends StObject {
  
  val attributes: js.Array[
    accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
  ] = js.native
  
  val children: PhrasingContentSchema = js.native
}
object Children {
  
  @scala.inline
  def apply(
    attributes: js.Array[
      accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
    ],
    children: PhrasingContentSchema
  ): Children = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(
      value: js.Array[
          accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate
        ]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(
      value: (accessKey | accessKeyLabel | autocapitalize | dir | draggable | hidden | innerText | lang | offsetHeight | offsetLeft | offsetParent | offsetTop | offsetWidth | spellcheck | title | translate)*
    ): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: PhrasingContentSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
