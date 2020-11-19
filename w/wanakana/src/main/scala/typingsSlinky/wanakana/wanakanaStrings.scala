package typingsSlinky.wanakana

import typingsSlinky.wanakana.mod.IMEModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wanakanaStrings {
  
  @scala.inline
  def hepburn: hepburn = "hepburn".asInstanceOf[hepburn]
  
  @scala.inline
  def toHiragana: toHiragana = "toHiragana".asInstanceOf[toHiragana]
  
  @scala.inline
  def toKatakana: toKatakana = "toKatakana".asInstanceOf[toKatakana]
  
  @js.native
  sealed trait hepburn extends js.Object
  
  @js.native
  sealed trait toHiragana extends IMEModes
  
  @js.native
  sealed trait toKatakana extends IMEModes
}
