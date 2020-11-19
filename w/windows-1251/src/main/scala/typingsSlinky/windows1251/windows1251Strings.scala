package typingsSlinky.windows1251

import typingsSlinky.windows1251.mod.DecoderMode
import typingsSlinky.windows1251.mod.EncoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windows1251Strings {
  
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  
  @scala.inline
  def html: html = "html".asInstanceOf[html]
  
  @scala.inline
  def replacement: replacement = "replacement".asInstanceOf[replacement]
  
  @js.native
  sealed trait fatal
    extends DecoderMode
       with EncoderMode
  
  @js.native
  sealed trait html extends EncoderMode
  
  @js.native
  sealed trait replacement extends DecoderMode
}
