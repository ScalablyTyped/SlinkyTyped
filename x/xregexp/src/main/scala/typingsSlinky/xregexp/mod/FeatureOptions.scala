package typingsSlinky.xregexp.mod

import typingsSlinky.xregexp.anon.Astral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All valid ways of specifying features to install or uninstall.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xregexp.mod.Feature
  - typingsSlinky.xregexp.xregexpStrings.`astral namespacing`
  - typingsSlinky.xregexp.xregexpStrings.`namespacing astral`
  - typingsSlinky.xregexp.anon.Astral
*/
trait FeatureOptions extends js.Object

object FeatureOptions {
  @scala.inline
  def `astral namespacing`: typingsSlinky.xregexp.xregexpStrings.`astral namespacing` = ("astral namespacing").asInstanceOf[typingsSlinky.xregexp.xregexpStrings.`astral namespacing`]
  @scala.inline
  def `namespacing astral`: typingsSlinky.xregexp.xregexpStrings.`namespacing astral` = ("namespacing astral").asInstanceOf[typingsSlinky.xregexp.xregexpStrings.`namespacing astral`]
  @scala.inline
  implicit def apply(value: Astral): FeatureOptions = value.asInstanceOf[FeatureOptions]
  @scala.inline
  implicit def apply(value: Feature): FeatureOptions = value.asInstanceOf[FeatureOptions]
}

