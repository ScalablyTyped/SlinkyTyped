package typingsSlinky.styleSearch

import typingsSlinky.styleSearch.mod.SyntaxFeatureOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleSearchStrings {
  
  @scala.inline
  def check: check = "check".asInstanceOf[check]
  
  @scala.inline
  def only: only = "only".asInstanceOf[only]
  
  @scala.inline
  def skip: skip = "skip".asInstanceOf[skip]
  
  @js.native
  sealed trait check extends SyntaxFeatureOption
  
  @js.native
  sealed trait only extends SyntaxFeatureOption
  
  @js.native
  sealed trait skip extends SyntaxFeatureOption
}
