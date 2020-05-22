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
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  val attributes: js.Array[
    charset | coords | download | hreflang | name | ping | referrerPolicy | rel | relList | rev | shape | target | text | `type`
  ]
  val children: PhrasingContentSchema
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
}

