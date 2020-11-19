package typingsSlinky.wordpressBlocks.anon

import typingsSlinky.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.`type`
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.charset
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.coords
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.download
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.hreflang
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.name
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.ping
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.referrerPolicy
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.rel
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.relList
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.rev
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.shape
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.target
import typingsSlinky.wordpressBlocks.wordpressBlocksStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attributes extends js.Object {
  
  val attributes: js.Array[
    charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
  ] = js.native
  
  val children: PhrasingContentSchema = js.native
}
object Attributes {
  
  @scala.inline
  def apply(
    attributes: js.Array[
      charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
    ],
    children: PhrasingContentSchema
  ): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesVarargs(
      value: (charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`)*
    ): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(
      value: js.Array[
          charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
        ]
    ): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: PhrasingContentSchema): Self = this.set("children", value.asInstanceOf[js.Any])
  }
}
