package typingsSlinky.voca

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("voca", JSImport.Namespace)
  @js.native
  val ^ : VocaStatic = js.native
  
  @js.native
  trait Chain extends StObject {
    
    // Case
    def camelCase(): Chain = js.native
    
    def capitalize(): Chain = js.native
    def capitalize(restToLoweropt: Boolean): Chain = js.native
    
    def chain(): ExplicitChain[String] = js.native
    
    // Chop
    def charAt(): Chain = js.native
    def charAt(position: Double): Chain = js.native
    
    // Split
    def chars(): js.Array[String] = js.native
    
    def codePointAt(): Chain = js.native
    def codePointAt(position: Double): Chain = js.native
    
    def codePoints(): js.Array[Double] = js.native
    
    // Count
    def count(): Double = js.native
    
    def countGraphemes(): Double = js.native
    
    def countSubstrings(): Double = js.native
    def countSubstrings(substring: String): Double = js.native
    
    def countWhere(): Double = js.native
    def countWhere(predicate: js.UndefOr[scala.Nothing], context: js.Any): Double = js.native
    def countWhere(predicate: CountPredicate): Double = js.native
    def countWhere(predicate: CountPredicate, context: js.Any): Double = js.native
    
    def countWords(): Double = js.native
    def countWords(pattern: js.UndefOr[scala.Nothing], flags: String): Double = js.native
    def countWords(pattern: String): Double = js.native
    def countWords(pattern: String, flags: String): Double = js.native
    def countWords(pattern: js.RegExp): Double = js.native
    def countWords(pattern: js.RegExp, flags: String): Double = js.native
    
    def decapitalize(): Chain = js.native
    
    // Query
    def endsWith(): Boolean = js.native
    def endsWith(end: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def endsWith(end: String): Boolean = js.native
    def endsWith(end: String, position: Double): Boolean = js.native
    
    // Escape
    def escapeHtml(): Chain = js.native
    
    def escapeRegExp(): Chain = js.native
    
    def first(): Chain = js.native
    def first(length: Double): Chain = js.native
    
    def graphemeAt(): Chain = js.native
    def graphemeAt(position: Double): Chain = js.native
    
    def graphemes(): js.Array[String] = js.native
    
    def includes(): Boolean = js.native
    def includes(search: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def includes(search: String): Boolean = js.native
    def includes(search: String, position: Double): Boolean = js.native
    
    // Index
    def indexOf(): Double = js.native
    def indexOf(search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def indexOf(search: String): Double = js.native
    def indexOf(search: String, fromIndex: Double): Double = js.native
    
    // Multipulate
    def insert(): Chain = js.native
    def insert(toInsert: js.UndefOr[scala.Nothing], position: Double): Chain = js.native
    def insert(toInsert: String): Chain = js.native
    def insert(toInsert: String, position: Double): Chain = js.native
    
    def isAlpha(): Boolean = js.native
    
    def isAlphaDigit(): Boolean = js.native
    
    def isBlank(): Boolean = js.native
    
    def isDigit(): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isLowerCase(): Boolean = js.native
    
    def isNumeric(): Boolean = js.native
    
    def isString(): Boolean = js.native
    
    def isUpperCase(): Boolean = js.native
    
    def kebabCase(): Chain = js.native
    
    def last(): Chain = js.native
    def last(length: Double): Chain = js.native
    
    def lastIndexOf(): Double = js.native
    def lastIndexOf(search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def lastIndexOf(search: String): Double = js.native
    def lastIndexOf(search: String, fromIndex: Double): Double = js.native
    
    def latinise(): Chain = js.native
    
    def lowerCase(): Chain = js.native
    
    def matches(): Boolean = js.native
    def matches(pattern: js.UndefOr[scala.Nothing], flags: String): Boolean = js.native
    def matches(pattern: String): Boolean = js.native
    def matches(pattern: String, flags: String): Boolean = js.native
    def matches(pattern: js.RegExp): Boolean = js.native
    def matches(pattern: js.RegExp, flags: String): Boolean = js.native
    
    def pad(): Chain = js.native
    def pad(length: js.UndefOr[scala.Nothing], pad: String): Chain = js.native
    def pad(length: Double): Chain = js.native
    def pad(length: Double, pad: String): Chain = js.native
    
    def padLeft(): Chain = js.native
    def padLeft(length: js.UndefOr[scala.Nothing], pad: String): Chain = js.native
    def padLeft(length: Double): Chain = js.native
    def padLeft(length: Double, pad: String): Chain = js.native
    
    def padRight(): Chain = js.native
    def padRight(length: js.UndefOr[scala.Nothing], pad: String): Chain = js.native
    def padRight(length: Double): Chain = js.native
    def padRight(length: Double, pad: String): Chain = js.native
    
    def prune(): Chain = js.native
    def prune(length: js.UndefOr[scala.Nothing], end: String): Chain = js.native
    def prune(length: Double): Chain = js.native
    def prune(length: Double, end: String): Chain = js.native
    
    def repeat(): Chain = js.native
    def repeat(times: Double): Chain = js.native
    
    def replace(): Chain = js.native
    def replace(pattern: js.UndefOr[scala.Nothing], replacement: String): Chain = js.native
    def replace(pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): Chain = js.native
    def replace(pattern: String): Chain = js.native
    def replace(pattern: String, replacement: String): Chain = js.native
    def replace(pattern: String, replacement: ReplacementFunction): Chain = js.native
    def replace(pattern: js.RegExp): Chain = js.native
    def replace(pattern: js.RegExp, replacement: String): Chain = js.native
    def replace(pattern: js.RegExp, replacement: ReplacementFunction): Chain = js.native
    
    def replaceAll(): Chain = js.native
    def replaceAll(pattern: js.UndefOr[scala.Nothing], replacement: String): Chain = js.native
    def replaceAll(pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): Chain = js.native
    def replaceAll(pattern: String): Chain = js.native
    def replaceAll(pattern: String, replacement: String): Chain = js.native
    def replaceAll(pattern: String, replacement: ReplacementFunction): Chain = js.native
    def replaceAll(pattern: js.RegExp): Chain = js.native
    def replaceAll(pattern: js.RegExp, replacement: String): Chain = js.native
    def replaceAll(pattern: js.RegExp, replacement: ReplacementFunction): Chain = js.native
    
    def reverse(): Chain = js.native
    
    def reverseGrapheme(): Chain = js.native
    
    def search(): Double = js.native
    def search(pattern: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def search(pattern: String): Double = js.native
    def search(pattern: String, fromIndex: Double): Double = js.native
    def search(pattern: js.RegExp): Double = js.native
    def search(pattern: js.RegExp, fromIndex: Double): Double = js.native
    
    def slice(): Chain = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Chain = js.native
    def slice(start: Double): Chain = js.native
    def slice(start: Double, end: Double): Chain = js.native
    
    def slugify(): Chain = js.native
    
    def snakeCase(): Chain = js.native
    
    def splice(): Chain = js.native
    def splice(start: js.UndefOr[scala.Nothing], deleteCount: js.UndefOr[scala.Nothing], toAdd: String): Chain = js.native
    def splice(start: js.UndefOr[scala.Nothing], deleteCount: Double): Chain = js.native
    def splice(start: js.UndefOr[scala.Nothing], deleteCount: Double, toAdd: String): Chain = js.native
    def splice(start: Double): Chain = js.native
    def splice(start: Double, deleteCount: js.UndefOr[scala.Nothing], toAdd: String): Chain = js.native
    def splice(start: Double, deleteCount: Double): Chain = js.native
    def splice(start: Double, deleteCount: Double, toAdd: String): Chain = js.native
    
    def split(): js.Array[String] = js.native
    def split(separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
    def split(separator: String): js.Array[String] = js.native
    def split(separator: String, limit: Double): js.Array[String] = js.native
    def split(separator: js.RegExp): js.Array[String] = js.native
    def split(separator: js.RegExp, limit: Double): js.Array[String] = js.native
    
    // Format
    def sprintf(replacements: js.Any*): Chain = js.native
    
    def startsWith(): Boolean = js.native
    def startsWith(start: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def startsWith(start: String): Boolean = js.native
    def startsWith(start: String, position: Double): Boolean = js.native
    
    // Strip
    def stripBom(): Chain = js.native
    
    def stripTags(): Chain = js.native
    def stripTags(allowbleTags: js.UndefOr[scala.Nothing], replacement: String): Chain = js.native
    def stripTags(allowbleTags: String): Chain = js.native
    def stripTags(allowbleTags: String, replacement: String): Chain = js.native
    def stripTags(allowbleTags: js.Array[String]): Chain = js.native
    def stripTags(allowbleTags: js.Array[String], replacement: String): Chain = js.native
    
    def substr(): Chain = js.native
    def substr(start: js.UndefOr[scala.Nothing], length: Double): Chain = js.native
    def substr(start: Double): Chain = js.native
    def substr(start: Double, length: Double): Chain = js.native
    
    def substring(): Chain = js.native
    def substring(start: js.UndefOr[scala.Nothing], end: Double): Chain = js.native
    def substring(start: Double): Chain = js.native
    def substring(start: Double, end: Double): Chain = js.native
    
    def swapCase(): Chain = js.native
    
    def titleCase(): Chain = js.native
    def titleCase(ignoreWordsopt: js.Array[String]): Chain = js.native
    
    def tr(): Chain = js.native
    def tr(from: js.UndefOr[scala.Nothing], to: String): Chain = js.native
    def tr(from: String): Chain = js.native
    def tr(from: String, to: String): Chain = js.native
    def tr(from: StringDictionary[String]): Chain = js.native
    
    def trim(): Chain = js.native
    def trim(whitespace: String): Chain = js.native
    
    def trimLeft(): Chain = js.native
    def trimLeft(whitespace: String): Chain = js.native
    
    def trimRight(): Chain = js.native
    def trimRight(whitespace: String): Chain = js.native
    
    def truncate(): Chain = js.native
    def truncate(length: js.UndefOr[scala.Nothing], end: String): Chain = js.native
    def truncate(length: Double): Chain = js.native
    def truncate(length: Double, end: String): Chain = js.native
    
    def unescapeHtml(): Chain = js.native
    
    def upperCase(): Chain = js.native
    
    // Chain
    def value(): String = js.native
    
    def vprintf(replacements: js.Any*): Chain = js.native
    
    def wordWrap(): Chain = js.native
    def wordWrap(options: WordWrapOptions): Chain = js.native
    
    def words(): js.Array[String] = js.native
    def words(pattern: js.UndefOr[scala.Nothing], flag: String): js.Array[String] = js.native
    def words(pattern: String): js.Array[String] = js.native
    def words(pattern: String, flag: String): js.Array[String] = js.native
    def words(pattern: js.RegExp): js.Array[String] = js.native
    def words(pattern: js.RegExp, flag: String): js.Array[String] = js.native
  }
  
  type CountPredicate = js.Function3[/* character */ String, /* index */ Double, /* str */ String, Boolean]
  
  @js.native
  trait ExplicitChain[T] extends StObject {
    
    // Case
    def camelCase(): ExplicitChain[String] = js.native
    
    def capitalize(): ExplicitChain[String] = js.native
    def capitalize(restToLoweropt: Boolean): ExplicitChain[String] = js.native
    
    // Chop
    def charAt(): ExplicitChain[String] = js.native
    def charAt(position: Double): ExplicitChain[String] = js.native
    
    // Split
    def chars(): ExplicitChain[js.Array[String]] = js.native
    
    def codePointAt(): ExplicitChain[String] = js.native
    def codePointAt(position: Double): ExplicitChain[String] = js.native
    
    def codePoints(): ExplicitChain[js.Array[Double]] = js.native
    
    // Count
    def count(): ExplicitChain[Double] = js.native
    
    def countGraphemes(): ExplicitChain[Double] = js.native
    
    def countSubstrings(): ExplicitChain[Double] = js.native
    def countSubstrings(substring: String): ExplicitChain[Double] = js.native
    
    def countWhere(): ExplicitChain[Double] = js.native
    def countWhere(predicate: js.UndefOr[scala.Nothing], context: js.Any): ExplicitChain[Double] = js.native
    def countWhere(predicate: CountPredicate): ExplicitChain[Double] = js.native
    def countWhere(predicate: CountPredicate, context: js.Any): ExplicitChain[Double] = js.native
    
    def countWords(): ExplicitChain[Double] = js.native
    def countWords(pattern: js.UndefOr[scala.Nothing], flags: String): ExplicitChain[Double] = js.native
    def countWords(pattern: String): ExplicitChain[Double] = js.native
    def countWords(pattern: String, flags: String): ExplicitChain[Double] = js.native
    def countWords(pattern: js.RegExp): ExplicitChain[Double] = js.native
    def countWords(pattern: js.RegExp, flags: String): ExplicitChain[Double] = js.native
    
    def decapitalize(): ExplicitChain[String] = js.native
    
    // Query
    def endsWith(): ExplicitChain[Boolean] = js.native
    def endsWith(end: js.UndefOr[scala.Nothing], position: Double): ExplicitChain[Boolean] = js.native
    def endsWith(end: String): ExplicitChain[Boolean] = js.native
    def endsWith(end: String, position: Double): ExplicitChain[Boolean] = js.native
    
    // Escape
    def escapeHtml(): ExplicitChain[String] = js.native
    
    def escapeRegExp(): ExplicitChain[String] = js.native
    
    def first(): ExplicitChain[String] = js.native
    def first(length: Double): ExplicitChain[String] = js.native
    
    def graphemeAt(): ExplicitChain[String] = js.native
    def graphemeAt(position: Double): ExplicitChain[String] = js.native
    
    def graphemes(): ExplicitChain[js.Array[String]] = js.native
    
    def includes(): ExplicitChain[Boolean] = js.native
    def includes(search: js.UndefOr[scala.Nothing], position: Double): ExplicitChain[Boolean] = js.native
    def includes(search: String): ExplicitChain[Boolean] = js.native
    def includes(search: String, position: Double): ExplicitChain[Boolean] = js.native
    
    // Index
    def indexOf(): ExplicitChain[Double] = js.native
    def indexOf(search: js.UndefOr[scala.Nothing], fromIndex: Double): ExplicitChain[Double] = js.native
    def indexOf(search: String): ExplicitChain[Double] = js.native
    def indexOf(search: String, fromIndex: Double): ExplicitChain[Double] = js.native
    
    // Multipulate
    def insert(): ExplicitChain[String] = js.native
    def insert(toInsert: js.UndefOr[scala.Nothing], position: Double): ExplicitChain[String] = js.native
    def insert(toInsert: String): ExplicitChain[String] = js.native
    def insert(toInsert: String, position: Double): ExplicitChain[String] = js.native
    
    def isAlpha(): ExplicitChain[Boolean] = js.native
    
    def isAlphaDigit(): ExplicitChain[Boolean] = js.native
    
    def isBlank(): ExplicitChain[Boolean] = js.native
    
    def isDigit(): ExplicitChain[Boolean] = js.native
    
    def isEmpty(): ExplicitChain[Boolean] = js.native
    
    def isLowerCase(): ExplicitChain[Boolean] = js.native
    
    def isNumeric(): ExplicitChain[Boolean] = js.native
    
    def isString(): ExplicitChain[Boolean] = js.native
    
    def isUpperCase(): ExplicitChain[Boolean] = js.native
    
    def kebabCase(): ExplicitChain[String] = js.native
    
    def last(): ExplicitChain[String] = js.native
    def last(length: Double): ExplicitChain[String] = js.native
    
    def lastIndexOf(): ExplicitChain[Double] = js.native
    def lastIndexOf(search: js.UndefOr[scala.Nothing], fromIndex: Double): ExplicitChain[Double] = js.native
    def lastIndexOf(search: String): ExplicitChain[Double] = js.native
    def lastIndexOf(search: String, fromIndex: Double): ExplicitChain[Double] = js.native
    
    def latinise(): ExplicitChain[String] = js.native
    
    def lowerCase(): ExplicitChain[String] = js.native
    
    def matches(): ExplicitChain[Boolean] = js.native
    def matches(pattern: js.UndefOr[scala.Nothing], flags: String): ExplicitChain[Boolean] = js.native
    def matches(pattern: String): ExplicitChain[Boolean] = js.native
    def matches(pattern: String, flags: String): ExplicitChain[Boolean] = js.native
    def matches(pattern: js.RegExp): ExplicitChain[Boolean] = js.native
    def matches(pattern: js.RegExp, flags: String): ExplicitChain[Boolean] = js.native
    
    def pad(): ExplicitChain[String] = js.native
    def pad(length: js.UndefOr[scala.Nothing], pad: String): ExplicitChain[String] = js.native
    def pad(length: Double): ExplicitChain[String] = js.native
    def pad(length: Double, pad: String): ExplicitChain[String] = js.native
    
    def padLeft(): ExplicitChain[String] = js.native
    def padLeft(length: js.UndefOr[scala.Nothing], pad: String): ExplicitChain[String] = js.native
    def padLeft(length: Double): ExplicitChain[String] = js.native
    def padLeft(length: Double, pad: String): ExplicitChain[String] = js.native
    
    def padRight(): ExplicitChain[String] = js.native
    def padRight(length: js.UndefOr[scala.Nothing], pad: String): ExplicitChain[String] = js.native
    def padRight(length: Double): ExplicitChain[String] = js.native
    def padRight(length: Double, pad: String): ExplicitChain[String] = js.native
    
    def prune(): ExplicitChain[String] = js.native
    def prune(length: js.UndefOr[scala.Nothing], end: String): ExplicitChain[String] = js.native
    def prune(length: Double): ExplicitChain[String] = js.native
    def prune(length: Double, end: String): ExplicitChain[String] = js.native
    
    def repeat(): ExplicitChain[String] = js.native
    def repeat(times: Double): ExplicitChain[String] = js.native
    
    def replace(): ExplicitChain[String] = js.native
    def replace(pattern: js.UndefOr[scala.Nothing], replacement: String): ExplicitChain[String] = js.native
    def replace(pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replace(pattern: String): ExplicitChain[String] = js.native
    def replace(pattern: String, replacement: String): ExplicitChain[String] = js.native
    def replace(pattern: String, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replace(pattern: js.RegExp): ExplicitChain[String] = js.native
    def replace(pattern: js.RegExp, replacement: String): ExplicitChain[String] = js.native
    def replace(pattern: js.RegExp, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    
    def replaceAll(): ExplicitChain[String] = js.native
    def replaceAll(pattern: js.UndefOr[scala.Nothing], replacement: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replaceAll(pattern: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: String, replacement: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: String, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    def replaceAll(pattern: js.RegExp): ExplicitChain[String] = js.native
    def replaceAll(pattern: js.RegExp, replacement: String): ExplicitChain[String] = js.native
    def replaceAll(pattern: js.RegExp, replacement: ReplacementFunction): ExplicitChain[String] = js.native
    
    def reverse(): ExplicitChain[String] = js.native
    
    def reverseGrapheme(): ExplicitChain[String] = js.native
    
    def search(): ExplicitChain[Double] = js.native
    def search(pattern: js.UndefOr[scala.Nothing], fromIndex: Double): ExplicitChain[Double] = js.native
    def search(pattern: String): ExplicitChain[Double] = js.native
    def search(pattern: String, fromIndex: Double): ExplicitChain[Double] = js.native
    def search(pattern: js.RegExp): ExplicitChain[Double] = js.native
    def search(pattern: js.RegExp, fromIndex: Double): ExplicitChain[Double] = js.native
    
    def slice(): ExplicitChain[String] = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): ExplicitChain[String] = js.native
    def slice(start: Double): ExplicitChain[String] = js.native
    def slice(start: Double, end: Double): ExplicitChain[String] = js.native
    
    def slugify(): ExplicitChain[String] = js.native
    
    def snakeCase(): ExplicitChain[String] = js.native
    
    def splice(): ExplicitChain[String] = js.native
    def splice(start: js.UndefOr[scala.Nothing], deleteCount: js.UndefOr[scala.Nothing], toAdd: String): ExplicitChain[String] = js.native
    def splice(start: js.UndefOr[scala.Nothing], deleteCount: Double): ExplicitChain[String] = js.native
    def splice(start: js.UndefOr[scala.Nothing], deleteCount: Double, toAdd: String): ExplicitChain[String] = js.native
    def splice(start: Double): ExplicitChain[String] = js.native
    def splice(start: Double, deleteCount: js.UndefOr[scala.Nothing], toAdd: String): ExplicitChain[String] = js.native
    def splice(start: Double, deleteCount: Double): ExplicitChain[String] = js.native
    def splice(start: Double, deleteCount: Double, toAdd: String): ExplicitChain[String] = js.native
    
    def split(): ExplicitChain[js.Array[String]] = js.native
    def split(separator: js.UndefOr[scala.Nothing], limit: Double): ExplicitChain[js.Array[String]] = js.native
    def split(separator: String): ExplicitChain[js.Array[String]] = js.native
    def split(separator: String, limit: Double): ExplicitChain[js.Array[String]] = js.native
    def split(separator: js.RegExp): ExplicitChain[js.Array[String]] = js.native
    def split(separator: js.RegExp, limit: Double): ExplicitChain[js.Array[String]] = js.native
    
    // Format
    def sprintf(replacements: js.Any*): ExplicitChain[String] = js.native
    
    def startsWith(): ExplicitChain[Boolean] = js.native
    def startsWith(start: js.UndefOr[scala.Nothing], position: Double): ExplicitChain[Boolean] = js.native
    def startsWith(start: String): ExplicitChain[Boolean] = js.native
    def startsWith(start: String, position: Double): ExplicitChain[Boolean] = js.native
    
    // Strip
    def stripBom(): ExplicitChain[String] = js.native
    
    def stripTags(): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: js.UndefOr[scala.Nothing], replacement: String): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: String): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: String, replacement: String): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: js.Array[String]): ExplicitChain[String] = js.native
    def stripTags(allowbleTags: js.Array[String], replacement: String): ExplicitChain[String] = js.native
    
    def substr(): ExplicitChain[String] = js.native
    def substr(start: js.UndefOr[scala.Nothing], length: Double): ExplicitChain[String] = js.native
    def substr(start: Double): ExplicitChain[String] = js.native
    def substr(start: Double, length: Double): ExplicitChain[String] = js.native
    
    def substring(): ExplicitChain[String] = js.native
    def substring(start: js.UndefOr[scala.Nothing], end: Double): ExplicitChain[String] = js.native
    def substring(start: Double): ExplicitChain[String] = js.native
    def substring(start: Double, end: Double): ExplicitChain[String] = js.native
    
    def swapCase(): ExplicitChain[String] = js.native
    
    def thru[U](changer: js.Function1[/* subjects */ T, U]): ExplicitChain[U] = js.native
    
    def titleCase(): ExplicitChain[String] = js.native
    def titleCase(ignoreWordsopt: js.Array[String]): ExplicitChain[String] = js.native
    
    def tr(): ExplicitChain[String] = js.native
    def tr(from: js.UndefOr[scala.Nothing], to: String): ExplicitChain[String] = js.native
    def tr(from: String): ExplicitChain[String] = js.native
    def tr(from: String, to: String): ExplicitChain[String] = js.native
    def tr(from: StringDictionary[String]): ExplicitChain[String] = js.native
    
    def trim(): ExplicitChain[String] = js.native
    def trim(whitespace: String): ExplicitChain[String] = js.native
    
    def trimLeft(): ExplicitChain[String] = js.native
    def trimLeft(whitespace: String): ExplicitChain[String] = js.native
    
    def trimRight(): ExplicitChain[String] = js.native
    def trimRight(whitespace: String): ExplicitChain[String] = js.native
    
    def truncate(): ExplicitChain[String] = js.native
    def truncate(length: js.UndefOr[scala.Nothing], end: String): ExplicitChain[String] = js.native
    def truncate(length: Double): ExplicitChain[String] = js.native
    def truncate(length: Double, end: String): ExplicitChain[String] = js.native
    
    def unescapeHtml(): ExplicitChain[String] = js.native
    
    def upperCase(): ExplicitChain[String] = js.native
    
    // Chain
    def value(): T = js.native
    
    def vprintf(replacements: js.Any*): ExplicitChain[String] = js.native
    
    def wordWrap(): ExplicitChain[String] = js.native
    def wordWrap(options: WordWrapOptions): ExplicitChain[String] = js.native
    
    def words(): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: js.UndefOr[scala.Nothing], flag: String): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: String): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: String, flag: String): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: js.RegExp): ExplicitChain[js.Array[String]] = js.native
    def words(pattern: js.RegExp, flag: String): ExplicitChain[js.Array[String]] = js.native
  }
  
  type ReplacementFunction = js.Function2[/* match */ js.UndefOr[String], /* repeated */ String, String]
  
  @js.native
  trait VocaStatic extends StObject {
    
    // Chain
    def apply(subject: js.Any): Chain = js.native
    
    // Case
    def camelCase(): String = js.native
    def camelCase(subject: String): String = js.native
    
    def capitalize(): String = js.native
    def capitalize(subject: js.UndefOr[scala.Nothing], restToLower: Boolean): String = js.native
    def capitalize(subject: String): String = js.native
    def capitalize(subject: String, restToLower: Boolean): String = js.native
    
    def chain[T](subject: T): ExplicitChain[T] = js.native
    
    // Chop
    def charAt(): String = js.native
    def charAt(subject: js.UndefOr[scala.Nothing], position: Double): String = js.native
    def charAt(subject: String): String = js.native
    def charAt(subject: String, position: Double): String = js.native
    
    // Split
    def chars(): js.Array[String] = js.native
    def chars(subject: String): js.Array[String] = js.native
    
    def codePointAt(): String = js.native
    def codePointAt(subject: js.UndefOr[scala.Nothing], position: Double): String = js.native
    def codePointAt(subject: String): String = js.native
    def codePointAt(subject: String, position: Double): String = js.native
    
    def codePoints(): js.Array[Double] = js.native
    def codePoints(subject: String): js.Array[Double] = js.native
    
    // Count
    def count(): Double = js.native
    def count(subject: String): Double = js.native
    
    def countGraphemes(): Double = js.native
    def countGraphemes(subject: String): Double = js.native
    
    def countSubstrings(): Double = js.native
    def countSubstrings(subject: js.UndefOr[scala.Nothing], substring: String): Double = js.native
    def countSubstrings(subject: String): Double = js.native
    def countSubstrings(subject: String, substring: String): Double = js.native
    
    def countWhere(): Double = js.native
    def countWhere(subject: js.UndefOr[scala.Nothing], predicate: js.UndefOr[scala.Nothing], context: js.Any): Double = js.native
    def countWhere(subject: js.UndefOr[scala.Nothing], predicate: CountPredicate): Double = js.native
    def countWhere(subject: js.UndefOr[scala.Nothing], predicate: CountPredicate, context: js.Any): Double = js.native
    def countWhere(subject: String): Double = js.native
    def countWhere(subject: String, predicate: js.UndefOr[scala.Nothing], context: js.Any): Double = js.native
    def countWhere(subject: String, predicate: CountPredicate): Double = js.native
    def countWhere(subject: String, predicate: CountPredicate, context: js.Any): Double = js.native
    
    def countWords(): Double = js.native
    def countWords(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], flags: String): Double = js.native
    def countWords(subject: js.UndefOr[scala.Nothing], pattern: String): Double = js.native
    def countWords(subject: js.UndefOr[scala.Nothing], pattern: String, flags: String): Double = js.native
    def countWords(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp): Double = js.native
    def countWords(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, flags: String): Double = js.native
    def countWords(subject: String): Double = js.native
    def countWords(subject: String, pattern: js.UndefOr[scala.Nothing], flags: String): Double = js.native
    def countWords(subject: String, pattern: String): Double = js.native
    def countWords(subject: String, pattern: String, flags: String): Double = js.native
    def countWords(subject: String, pattern: js.RegExp): Double = js.native
    def countWords(subject: String, pattern: js.RegExp, flags: String): Double = js.native
    
    def decapitalize(): String = js.native
    def decapitalize(subject: String): String = js.native
    
    // Query
    def endsWith(): Boolean = js.native
    def endsWith(subject: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def endsWith(subject: js.UndefOr[scala.Nothing], end: String): Boolean = js.native
    def endsWith(subject: js.UndefOr[scala.Nothing], end: String, position: Double): Boolean = js.native
    def endsWith(subject: String): Boolean = js.native
    def endsWith(subject: String, end: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def endsWith(subject: String, end: String): Boolean = js.native
    def endsWith(subject: String, end: String, position: Double): Boolean = js.native
    
    // Escape
    def escapeHtml(): String = js.native
    def escapeHtml(subject: String): String = js.native
    
    def escapeRegExp(): String = js.native
    def escapeRegExp(subject: String): String = js.native
    
    def first(): String = js.native
    def first(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def first(subject: String): String = js.native
    def first(subject: String, length: Double): String = js.native
    
    def graphemeAt(): String = js.native
    def graphemeAt(subject: js.UndefOr[scala.Nothing], position: Double): String = js.native
    def graphemeAt(subject: String): String = js.native
    def graphemeAt(subject: String, position: Double): String = js.native
    
    def graphemes(): js.Array[String] = js.native
    def graphemes(subject: String): js.Array[String] = js.native
    
    def includes(): Boolean = js.native
    def includes(subject: js.UndefOr[scala.Nothing], search: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def includes(subject: js.UndefOr[scala.Nothing], search: String): Boolean = js.native
    def includes(subject: js.UndefOr[scala.Nothing], search: String, position: Double): Boolean = js.native
    def includes(subject: String): Boolean = js.native
    def includes(subject: String, search: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def includes(subject: String, search: String): Boolean = js.native
    def includes(subject: String, search: String, position: Double): Boolean = js.native
    
    // Index
    def indexOf(): Double = js.native
    def indexOf(subject: js.UndefOr[scala.Nothing], search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def indexOf(subject: js.UndefOr[scala.Nothing], search: String): Double = js.native
    def indexOf(subject: js.UndefOr[scala.Nothing], search: String, fromIndex: Double): Double = js.native
    def indexOf(subject: String): Double = js.native
    def indexOf(subject: String, search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def indexOf(subject: String, search: String): Double = js.native
    def indexOf(subject: String, search: String, fromIndex: Double): Double = js.native
    
    // Manipulate
    def insert(): String = js.native
    def insert(subject: js.UndefOr[scala.Nothing], toInsert: js.UndefOr[scala.Nothing], position: Double): String = js.native
    def insert(subject: js.UndefOr[scala.Nothing], toInsert: String): String = js.native
    def insert(subject: js.UndefOr[scala.Nothing], toInsert: String, position: Double): String = js.native
    def insert(subject: String): String = js.native
    def insert(subject: String, toInsert: js.UndefOr[scala.Nothing], position: Double): String = js.native
    def insert(subject: String, toInsert: String): String = js.native
    def insert(subject: String, toInsert: String, position: Double): String = js.native
    
    def isAlpha(): Boolean = js.native
    def isAlpha(subject: String): Boolean = js.native
    
    def isAlphaDigit(): Boolean = js.native
    def isAlphaDigit(subject: String): Boolean = js.native
    
    def isBlank(): Boolean = js.native
    def isBlank(subject: String): Boolean = js.native
    
    def isDigit(): Boolean = js.native
    def isDigit(subject: String): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    def isEmpty(subject: String): Boolean = js.native
    
    def isLowerCase(): Boolean = js.native
    def isLowerCase(subject: String): Boolean = js.native
    
    def isNumeric(): Boolean = js.native
    def isNumeric(subject: String): Boolean = js.native
    
    def isString(): Boolean = js.native
    def isString(subject: js.Any): Boolean = js.native
    
    def isUpperCase(): Boolean = js.native
    def isUpperCase(subject: String): Boolean = js.native
    
    def kebabCase(): String = js.native
    def kebabCase(subject: String): String = js.native
    
    def last(): String = js.native
    def last(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def last(subject: String): String = js.native
    def last(subject: String, length: Double): String = js.native
    
    def lastIndexOf(): Double = js.native
    def lastIndexOf(subject: js.UndefOr[scala.Nothing], search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def lastIndexOf(subject: js.UndefOr[scala.Nothing], search: String): Double = js.native
    def lastIndexOf(subject: js.UndefOr[scala.Nothing], search: String, fromIndex: Double): Double = js.native
    def lastIndexOf(subject: String): Double = js.native
    def lastIndexOf(subject: String, search: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def lastIndexOf(subject: String, search: String): Double = js.native
    def lastIndexOf(subject: String, search: String, fromIndex: Double): Double = js.native
    
    def latinise(): String = js.native
    def latinise(subject: String): String = js.native
    
    def lowerCase(): String = js.native
    def lowerCase(subject: String): String = js.native
    
    def matches(): Boolean = js.native
    def matches(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], flags: String): Boolean = js.native
    def matches(subject: js.UndefOr[scala.Nothing], pattern: String): Boolean = js.native
    def matches(subject: js.UndefOr[scala.Nothing], pattern: String, flags: String): Boolean = js.native
    def matches(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp): Boolean = js.native
    def matches(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, flags: String): Boolean = js.native
    def matches(subject: String): Boolean = js.native
    def matches(subject: String, pattern: js.UndefOr[scala.Nothing], flags: String): Boolean = js.native
    def matches(subject: String, pattern: String): Boolean = js.native
    def matches(subject: String, pattern: String, flags: String): Boolean = js.native
    def matches(subject: String, pattern: js.RegExp): Boolean = js.native
    def matches(subject: String, pattern: js.RegExp, flags: String): Boolean = js.native
    
    // Util
    def noConflict(): VocaStatic = js.native
    
    def pad(): String = js.native
    def pad(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], pad: String): String = js.native
    def pad(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def pad(subject: js.UndefOr[scala.Nothing], length: Double, pad: String): String = js.native
    def pad(subject: String): String = js.native
    def pad(subject: String, length: js.UndefOr[scala.Nothing], pad: String): String = js.native
    def pad(subject: String, length: Double): String = js.native
    def pad(subject: String, length: Double, pad: String): String = js.native
    
    def padLeft(): String = js.native
    def padLeft(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], pad: String): String = js.native
    def padLeft(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def padLeft(subject: js.UndefOr[scala.Nothing], length: Double, pad: String): String = js.native
    def padLeft(subject: String): String = js.native
    def padLeft(subject: String, length: js.UndefOr[scala.Nothing], pad: String): String = js.native
    def padLeft(subject: String, length: Double): String = js.native
    def padLeft(subject: String, length: Double, pad: String): String = js.native
    
    def padRight(): String = js.native
    def padRight(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], pad: String): String = js.native
    def padRight(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def padRight(subject: js.UndefOr[scala.Nothing], length: Double, pad: String): String = js.native
    def padRight(subject: String): String = js.native
    def padRight(subject: String, length: js.UndefOr[scala.Nothing], pad: String): String = js.native
    def padRight(subject: String, length: Double): String = js.native
    def padRight(subject: String, length: Double, pad: String): String = js.native
    
    def prune(): String = js.native
    def prune(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], end: String): String = js.native
    def prune(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def prune(subject: js.UndefOr[scala.Nothing], length: Double, end: String): String = js.native
    def prune(subject: String): String = js.native
    def prune(subject: String, length: js.UndefOr[scala.Nothing], end: String): String = js.native
    def prune(subject: String, length: Double): String = js.native
    def prune(subject: String, length: Double, end: String): String = js.native
    
    def repeat(): String = js.native
    def repeat(subject: js.UndefOr[scala.Nothing], times: Double): String = js.native
    def repeat(subject: String): String = js.native
    def repeat(subject: String, times: Double): String = js.native
    
    def replace(): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
    def replace(
      subject: js.UndefOr[scala.Nothing],
      pattern: js.UndefOr[scala.Nothing],
      replacement: ReplacementFunction
    ): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: String): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: String): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: ReplacementFunction): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, replacement: String): String = js.native
    def replace(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, replacement: ReplacementFunction): String = js.native
    def replace(subject: String): String = js.native
    def replace(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
    def replace(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): String = js.native
    def replace(subject: String, pattern: String): String = js.native
    def replace(subject: String, pattern: String, replacement: String): String = js.native
    def replace(subject: String, pattern: String, replacement: ReplacementFunction): String = js.native
    def replace(subject: String, pattern: js.RegExp): String = js.native
    def replace(subject: String, pattern: js.RegExp, replacement: String): String = js.native
    def replace(subject: String, pattern: js.RegExp, replacement: ReplacementFunction): String = js.native
    
    def replaceAll(): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
    def replaceAll(
      subject: js.UndefOr[scala.Nothing],
      pattern: js.UndefOr[scala.Nothing],
      replacement: ReplacementFunction
    ): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: String): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: String): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: String, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, replacement: String): String = js.native
    def replaceAll(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: String): String = js.native
    def replaceAll(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: String): String = js.native
    def replaceAll(subject: String, pattern: js.UndefOr[scala.Nothing], replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: String, pattern: String): String = js.native
    def replaceAll(subject: String, pattern: String, replacement: String): String = js.native
    def replaceAll(subject: String, pattern: String, replacement: ReplacementFunction): String = js.native
    def replaceAll(subject: String, pattern: js.RegExp): String = js.native
    def replaceAll(subject: String, pattern: js.RegExp, replacement: String): String = js.native
    def replaceAll(subject: String, pattern: js.RegExp, replacement: ReplacementFunction): String = js.native
    
    def reverse(): String = js.native
    def reverse(subject: String): String = js.native
    
    def reverseGrapheme(): String = js.native
    def reverseGrapheme(subject: String): String = js.native
    
    def search(): Double = js.native
    def search(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def search(subject: js.UndefOr[scala.Nothing], pattern: String): Double = js.native
    def search(subject: js.UndefOr[scala.Nothing], pattern: String, fromIndex: Double): Double = js.native
    def search(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp): Double = js.native
    def search(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, fromIndex: Double): Double = js.native
    def search(subject: String): Double = js.native
    def search(subject: String, pattern: js.UndefOr[scala.Nothing], fromIndex: Double): Double = js.native
    def search(subject: String, pattern: String): Double = js.native
    def search(subject: String, pattern: String, fromIndex: Double): Double = js.native
    def search(subject: String, pattern: js.RegExp): Double = js.native
    def search(subject: String, pattern: js.RegExp, fromIndex: Double): Double = js.native
    
    def slice(): String = js.native
    def slice(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): String = js.native
    def slice(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
    def slice(subject: js.UndefOr[scala.Nothing], start: Double, end: Double): String = js.native
    def slice(subject: String): String = js.native
    def slice(subject: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
    def slice(subject: String, start: Double): String = js.native
    def slice(subject: String, start: Double, end: Double): String = js.native
    
    def slugify(): String = js.native
    def slugify(subject: String): String = js.native
    
    def snakeCase(): String = js.native
    def snakeCase(subject: String): String = js.native
    
    def splice(): String = js.native
    def splice(
      subject: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      deleteCount: js.UndefOr[scala.Nothing],
      toAdd: String
    ): String = js.native
    def splice(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], deleteCount: Double): String = js.native
    def splice(
      subject: js.UndefOr[scala.Nothing],
      start: js.UndefOr[scala.Nothing],
      deleteCount: Double,
      toAdd: String
    ): String = js.native
    def splice(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
    def splice(
      subject: js.UndefOr[scala.Nothing],
      start: Double,
      deleteCount: js.UndefOr[scala.Nothing],
      toAdd: String
    ): String = js.native
    def splice(subject: js.UndefOr[scala.Nothing], start: Double, deleteCount: Double): String = js.native
    def splice(subject: js.UndefOr[scala.Nothing], start: Double, deleteCount: Double, toAdd: String): String = js.native
    def splice(subject: String): String = js.native
    def splice(
      subject: String,
      start: js.UndefOr[scala.Nothing],
      deleteCount: js.UndefOr[scala.Nothing],
      toAdd: String
    ): String = js.native
    def splice(subject: String, start: js.UndefOr[scala.Nothing], deleteCount: Double): String = js.native
    def splice(subject: String, start: js.UndefOr[scala.Nothing], deleteCount: Double, toAdd: String): String = js.native
    def splice(subject: String, start: Double): String = js.native
    def splice(subject: String, start: Double, deleteCount: js.UndefOr[scala.Nothing], toAdd: String): String = js.native
    def splice(subject: String, start: Double, deleteCount: Double): String = js.native
    def splice(subject: String, start: Double, deleteCount: Double, toAdd: String): String = js.native
    
    def split(): js.Array[String] = js.native
    def split(subject: js.UndefOr[scala.Nothing], separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
    def split(subject: js.UndefOr[scala.Nothing], separator: String): js.Array[String] = js.native
    def split(subject: js.UndefOr[scala.Nothing], separator: String, limit: Double): js.Array[String] = js.native
    def split(subject: js.UndefOr[scala.Nothing], separator: js.RegExp): js.Array[String] = js.native
    def split(subject: js.UndefOr[scala.Nothing], separator: js.RegExp, limit: Double): js.Array[String] = js.native
    def split(subject: String): js.Array[String] = js.native
    def split(subject: String, separator: js.UndefOr[scala.Nothing], limit: Double): js.Array[String] = js.native
    def split(subject: String, separator: String): js.Array[String] = js.native
    def split(subject: String, separator: String, limit: Double): js.Array[String] = js.native
    def split(subject: String, separator: js.RegExp): js.Array[String] = js.native
    def split(subject: String, separator: js.RegExp, limit: Double): js.Array[String] = js.native
    
    def sprintf(format: js.UndefOr[scala.Nothing], replacements: js.Any*): String = js.native
    // Format
    def sprintf(format: String, replacements: js.Any*): String = js.native
    
    def startsWith(): Boolean = js.native
    def startsWith(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def startsWith(subject: js.UndefOr[scala.Nothing], start: String): Boolean = js.native
    def startsWith(subject: js.UndefOr[scala.Nothing], start: String, position: Double): Boolean = js.native
    def startsWith(subject: String): Boolean = js.native
    def startsWith(subject: String, start: js.UndefOr[scala.Nothing], position: Double): Boolean = js.native
    def startsWith(subject: String, start: String): Boolean = js.native
    def startsWith(subject: String, start: String, position: Double): Boolean = js.native
    
    // Strip
    def stripBom(): String = js.native
    def stripBom(subject: String): String = js.native
    
    def stripTags(): String = js.native
    def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: js.UndefOr[scala.Nothing], replacement: String): String = js.native
    def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: String): String = js.native
    def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: String, replacement: String): String = js.native
    def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: js.Array[String]): String = js.native
    def stripTags(subject: js.UndefOr[scala.Nothing], allowbleTags: js.Array[String], replacement: String): String = js.native
    def stripTags(subject: String): String = js.native
    def stripTags(subject: String, allowbleTags: js.UndefOr[scala.Nothing], replacement: String): String = js.native
    def stripTags(subject: String, allowbleTags: String): String = js.native
    def stripTags(subject: String, allowbleTags: String, replacement: String): String = js.native
    def stripTags(subject: String, allowbleTags: js.Array[String]): String = js.native
    def stripTags(subject: String, allowbleTags: js.Array[String], replacement: String): String = js.native
    
    def substr(): String = js.native
    def substr(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def substr(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
    def substr(subject: js.UndefOr[scala.Nothing], start: Double, length: Double): String = js.native
    def substr(subject: String): String = js.native
    def substr(subject: String, start: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def substr(subject: String, start: Double): String = js.native
    def substr(subject: String, start: Double, length: Double): String = js.native
    
    def substring(): String = js.native
    def substring(subject: js.UndefOr[scala.Nothing], start: js.UndefOr[scala.Nothing], end: Double): String = js.native
    def substring(subject: js.UndefOr[scala.Nothing], start: Double): String = js.native
    def substring(subject: js.UndefOr[scala.Nothing], start: Double, end: Double): String = js.native
    def substring(subject: String): String = js.native
    def substring(subject: String, start: js.UndefOr[scala.Nothing], end: Double): String = js.native
    def substring(subject: String, start: Double): String = js.native
    def substring(subject: String, start: Double, end: Double): String = js.native
    
    def swapCase(): String = js.native
    def swapCase(subject: String): String = js.native
    
    def titleCase(): String = js.native
    def titleCase(subject: js.UndefOr[scala.Nothing], ignoreWords: js.Array[String]): String = js.native
    def titleCase(subject: String): String = js.native
    def titleCase(subject: String, ignoreWords: js.Array[String]): String = js.native
    
    def tr(): String = js.native
    def tr(subject: js.UndefOr[scala.Nothing], from: js.UndefOr[scala.Nothing], to: String): String = js.native
    def tr(subject: js.UndefOr[scala.Nothing], from: String): String = js.native
    def tr(subject: js.UndefOr[scala.Nothing], from: String, to: String): String = js.native
    def tr(subject: js.UndefOr[scala.Nothing], from: StringDictionary[String]): String = js.native
    def tr(subject: String): String = js.native
    def tr(subject: String, from: js.UndefOr[scala.Nothing], to: String): String = js.native
    def tr(subject: String, from: String): String = js.native
    def tr(subject: String, from: String, to: String): String = js.native
    def tr(subject: String, from: StringDictionary[String]): String = js.native
    
    def trim(): String = js.native
    def trim(subject: js.UndefOr[scala.Nothing], whitespace: String): String = js.native
    def trim(subject: String): String = js.native
    def trim(subject: String, whitespace: String): String = js.native
    
    def trimLeft(): String = js.native
    def trimLeft(subject: js.UndefOr[scala.Nothing], whitespace: String): String = js.native
    def trimLeft(subject: String): String = js.native
    def trimLeft(subject: String, whitespace: String): String = js.native
    
    def trimRight(): String = js.native
    def trimRight(subject: js.UndefOr[scala.Nothing], whitespace: String): String = js.native
    def trimRight(subject: String): String = js.native
    def trimRight(subject: String, whitespace: String): String = js.native
    
    def truncate(): String = js.native
    def truncate(subject: js.UndefOr[scala.Nothing], length: js.UndefOr[scala.Nothing], end: String): String = js.native
    def truncate(subject: js.UndefOr[scala.Nothing], length: Double): String = js.native
    def truncate(subject: js.UndefOr[scala.Nothing], length: Double, end: String): String = js.native
    def truncate(subject: String): String = js.native
    def truncate(subject: String, length: js.UndefOr[scala.Nothing], end: String): String = js.native
    def truncate(subject: String, length: Double): String = js.native
    def truncate(subject: String, length: Double, end: String): String = js.native
    
    def unescapeHtml(): String = js.native
    def unescapeHtml(subject: String): String = js.native
    
    def upperCase(): String = js.native
    def upperCase(subject: String): String = js.native
    
    var version: String = js.native
    
    def vprintf(format: js.UndefOr[scala.Nothing], replacements: js.Any*): String = js.native
    def vprintf(format: String, replacements: js.Any*): String = js.native
    
    def wordWrap(): String = js.native
    def wordWrap(subject: js.UndefOr[scala.Nothing], options: WordWrapOptions): String = js.native
    def wordWrap(subject: String): String = js.native
    def wordWrap(subject: String, options: WordWrapOptions): String = js.native
    
    def words(): js.Array[String] = js.native
    def words(subject: js.UndefOr[scala.Nothing], pattern: js.UndefOr[scala.Nothing], flag: String): js.Array[String] = js.native
    def words(subject: js.UndefOr[scala.Nothing], pattern: String): js.Array[String] = js.native
    def words(subject: js.UndefOr[scala.Nothing], pattern: String, flag: String): js.Array[String] = js.native
    def words(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp): js.Array[String] = js.native
    def words(subject: js.UndefOr[scala.Nothing], pattern: js.RegExp, flag: String): js.Array[String] = js.native
    def words(subject: String): js.Array[String] = js.native
    def words(subject: String, pattern: js.UndefOr[scala.Nothing], flag: String): js.Array[String] = js.native
    def words(subject: String, pattern: String): js.Array[String] = js.native
    def words(subject: String, pattern: String, flag: String): js.Array[String] = js.native
    def words(subject: String, pattern: js.RegExp): js.Array[String] = js.native
    def words(subject: String, pattern: js.RegExp, flag: String): js.Array[String] = js.native
  }
  
  @js.native
  trait WordWrapOptions extends StObject {
    
    var cut: js.UndefOr[Boolean] = js.native
    
    var indent: js.UndefOr[String] = js.native
    
    var newLine: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object WordWrapOptions {
    
    @scala.inline
    def apply(): WordWrapOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WordWrapOptions]
    }
    
    @scala.inline
    implicit class WordWrapOptionsMutableBuilder[Self <: WordWrapOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCut(value: Boolean): Self = StObject.set(x, "cut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCutUndefined: Self = StObject.set(x, "cut", js.undefined)
      
      @scala.inline
      def setIndent(value: String): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
      
      @scala.inline
      def setNewLine(value: String): Self = StObject.set(x, "newLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewLineUndefined: Self = StObject.set(x, "newLine", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = VocaStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: VocaStatic = ^
}
