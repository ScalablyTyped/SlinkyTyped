package typingsSlinky.speedMeasureWebpackPlugin

import typingsSlinky.speedMeasureWebpackPlugin.mod.OutputFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object speedMeasureWebpackPluginStrings {
  @js.native
  sealed trait human extends OutputFormat
  
  @js.native
  sealed trait humanVerbose extends OutputFormat
  
  @js.native
  sealed trait json extends OutputFormat
  
  @scala.inline
  def human: human = "human".asInstanceOf[human]
  @scala.inline
  def humanVerbose: humanVerbose = "humanVerbose".asInstanceOf[humanVerbose]
  @scala.inline
  def json: json = "json".asInstanceOf[json]
}

