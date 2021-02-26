package typingsSlinky.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A single CSS style sheet. It inherits properties and methods from its parent, StyleSheet. */
@js.native
trait CSSStyleSheet extends StyleSheet {
  
  def addRule(): Double = js.native
  def addRule(selector: js.UndefOr[scala.Nothing], style: js.UndefOr[scala.Nothing], index: Double): Double = js.native
  def addRule(selector: js.UndefOr[scala.Nothing], style: java.lang.String): Double = js.native
  def addRule(selector: js.UndefOr[scala.Nothing], style: java.lang.String, index: Double): Double = js.native
  def addRule(selector: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: js.UndefOr[scala.Nothing], index: Double): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String): Double = js.native
  def addRule(selector: java.lang.String, style: java.lang.String, index: Double): Double = js.native
  
  val cssRules: org.scalajs.dom.raw.CSSRuleList = js.native
  
  def deleteRule(index: Double): Unit = js.native
  
  def insertRule(rule: java.lang.String): Double = js.native
  def insertRule(rule: java.lang.String, index: Double): Double = js.native
  
  val ownerRule: org.scalajs.dom.raw.CSSRule | Null = js.native
  
  def removeRule(): Unit = js.native
  def removeRule(index: Double): Unit = js.native
  
  val rules: org.scalajs.dom.raw.CSSRuleList = js.native
}
