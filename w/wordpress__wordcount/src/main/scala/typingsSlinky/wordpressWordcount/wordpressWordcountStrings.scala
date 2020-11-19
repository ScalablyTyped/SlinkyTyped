package typingsSlinky.wordpressWordcount

import typingsSlinky.wordpressWordcount.mod.CountType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordpressWordcountStrings {
  
  @scala.inline
  def characters_excluding_spaces: characters_excluding_spaces = "characters_excluding_spaces".asInstanceOf[characters_excluding_spaces]
  
  @scala.inline
  def characters_including_spaces: characters_including_spaces = "characters_including_spaces".asInstanceOf[characters_including_spaces]
  
  @scala.inline
  def words: words = "words".asInstanceOf[words]
  
  @js.native
  sealed trait characters_excluding_spaces extends CountType
  
  @js.native
  sealed trait characters_including_spaces extends CountType
  
  @js.native
  sealed trait words extends CountType
}
