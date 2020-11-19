package typingsSlinky.sugar

import typingsSlinky.sugar.sugarjs.Date.DateCreateOptions
import typingsSlinky.sugar.sugarjs.Locale
import typingsSlinky.sugar.sugarjs.Range
import typingsSlinky.sugar.sugarjs._NativeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateConstructor extends _NativeConstructor {
  
  def addLocale(localeCode: java.lang.String, `def`: js.Object): Locale = js.native
  
  def create(): Date = js.native
  def create(d: js.UndefOr[scala.Nothing], options: DateCreateOptions): Date = js.native
  def create(d: java.lang.String): Date = js.native
  def create(d: java.lang.String, options: DateCreateOptions): Date = js.native
  def create(d: Double): Date = js.native
  def create(d: Double, options: DateCreateOptions): Date = js.native
  def create(d: Date): Date = js.native
  def create(d: Date, options: DateCreateOptions): Date = js.native
  
  def getAllLocaleCodes(): Array[java.lang.String] = js.native
  
  def getAllLocales(): Array[Locale] = js.native
  
  def getLocale(): Locale = js.native
  def getLocale(localeCode: java.lang.String): Locale = js.native
  
  def range(): Range = js.native
  def range(start: js.UndefOr[scala.Nothing], end: java.lang.String): Range = js.native
  def range(start: js.UndefOr[scala.Nothing], end: Date): Range = js.native
  def range(start: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: java.lang.String): Range = js.native
  def range(start: java.lang.String, end: Date): Range = js.native
  def range(start: Date): Range = js.native
  def range(start: Date, end: java.lang.String): Range = js.native
  def range(start: Date, end: Date): Range = js.native
  
  def removeLocale(localeCode: java.lang.String): Locale = js.native
  
  def setLocale(localeCode: java.lang.String): Locale = js.native
}
