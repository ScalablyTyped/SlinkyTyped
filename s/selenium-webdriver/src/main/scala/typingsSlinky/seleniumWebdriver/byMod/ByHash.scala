package typingsSlinky.seleniumWebdriver.byMod

import typingsSlinky.seleniumWebdriver.anon.ClassName
import typingsSlinky.seleniumWebdriver.anon.Css
import typingsSlinky.seleniumWebdriver.anon.Id
import typingsSlinky.seleniumWebdriver.anon.Js
import typingsSlinky.seleniumWebdriver.anon.LinkText
import typingsSlinky.seleniumWebdriver.anon.Name
import typingsSlinky.seleniumWebdriver.anon.PartialLinkText
import typingsSlinky.seleniumWebdriver.anon.TagName
import typingsSlinky.seleniumWebdriver.anon.Xpath
import typingsSlinky.seleniumWebdriver.mod.Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.seleniumWebdriver.anon.ClassName
  - typingsSlinky.seleniumWebdriver.anon.Css
  - typingsSlinky.seleniumWebdriver.anon.Id
  - typingsSlinky.seleniumWebdriver.anon.Js
  - typingsSlinky.seleniumWebdriver.anon.LinkText
  - typingsSlinky.seleniumWebdriver.anon.Name
  - typingsSlinky.seleniumWebdriver.anon.PartialLinkText
  - typingsSlinky.seleniumWebdriver.anon.TagName
  - typingsSlinky.seleniumWebdriver.anon.Xpath
*/
trait ByHash extends Locator

object ByHash {
  @scala.inline
  implicit def apply(value: ClassName): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: Css): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: Id): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: Js): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: LinkText): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: Name): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: PartialLinkText): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: TagName): ByHash = value.asInstanceOf[ByHash]
  @scala.inline
  implicit def apply(value: Xpath): ByHash = value.asInstanceOf[ByHash]
}

