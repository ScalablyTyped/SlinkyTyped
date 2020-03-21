package typingsSlinky.xregexp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.RegExp
import typingsSlinky.std.RegExpExecArray
import typingsSlinky.xregexp.AnonBackref
import typingsSlinky.xregexp.AnonRegex
import typingsSlinky.xregexp.xregexpStrings.all
import typingsSlinky.xregexp.xregexpStrings.one
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// end API definitions
@JSImport("xregexp", "XRegExp")
@js.native
object XRegExp extends js.Object {
  var version: String = js.native
  def apply(pattern: String): js.RegExp = js.native
  def apply(pattern: String, flags: String): js.RegExp = js.native
  def apply(pattern: RegExp): js.RegExp = js.native
  // begin API definitions
  def addToken(
    regex: js.RegExp,
    handler: js.Function2[/* matchArr */ RegExpExecArray, /* scope */ String, String]
  ): Unit = js.native
  def addToken(
    regex: js.RegExp,
    handler: js.Function2[/* matchArr */ RegExpExecArray, /* scope */ String, String],
    options: TokenOpts
  ): Unit = js.native
  def build(pattern: String, subs: js.Array[String]): js.RegExp = js.native
  def build(pattern: String, subs: js.Array[String], flags: String): js.RegExp = js.native
  def build(pattern: String, subs: StringDictionary[RegExp]): js.RegExp = js.native
  def build(pattern: String, subs: StringDictionary[RegExp], flags: String): js.RegExp = js.native
  def cache(pattern: String): js.RegExp = js.native
  def cache(pattern: String, flags: String): js.RegExp = js.native
  def escape(str: String): String = js.native
  def exec(str: String, regex: js.RegExp): RegExpExecArray = js.native
  def exec(str: String, regex: js.RegExp, pos: Double): RegExpExecArray = js.native
  def exec(str: String, regex: js.RegExp, pos: Double, sticky: Boolean): RegExpExecArray = js.native
  def forEach(
    str: String,
    regex: js.RegExp,
    callback: js.Function4[
      /* matchArr */ RegExpExecArray, 
      /* index */ Double, 
      /* input */ String, 
      /* regexp */ js.RegExp, 
      Unit
    ]
  ): js.Any = js.native
  def globalize(regex: js.RegExp): js.RegExp = js.native
  def install(options: String): Unit = js.native
  def install(options: js.Object): Unit = js.native
  def isInstalled(feature: String): Boolean = js.native
  def isRegExp(value: js.Any): Boolean = js.native
  def `match`(str: String, regex: js.RegExp): js.Array[String] = js.native
  def `match`(str: String, regex: js.RegExp, scope: String): js.Any = js.native
  def matchChain(str: String, chain: js.Array[AnonBackref | AnonRegex | js.RegExp]): js.Array[String] = js.native
  def matchRecursive(str: String, left: String, right: String): js.Array[String] = js.native
  def matchRecursive(str: String, left: String, right: String, flags: String): js.Array[String] = js.native
  def matchRecursive(str: String, left: String, right: String, flags: String, options: js.Object): js.Array[String] = js.native
  @JSName("match")
  def match_all(str: String, regex: js.RegExp, scope: all): js.Array[String] = js.native
  @JSName("match")
  def match_one(str: String, regex: js.RegExp, scope: one): String = js.native
  def replace(str: String, search: String, replacement: String): String = js.native
  def replace(str: String, search: String, replacement: String, scope: String): String = js.native
  def replace(str: String, search: String, replacement: js.Function): String = js.native
  def replace(str: String, search: String, replacement: js.Function, scope: String): String = js.native
  def replace(str: String, search: RegExp, replacement: String): String = js.native
  def replace(str: String, search: RegExp, replacement: String, scope: String): String = js.native
  def replace(str: String, search: RegExp, replacement: js.Function): String = js.native
  def replace(str: String, search: RegExp, replacement: js.Function, scope: String): String = js.native
  def replaceEach(str: String, replacements: js.Array[js.Array[js.RegExp | String]]): String = js.native
  def split(str: String, separator: String): js.Array[String] = js.native
  def split(str: String, separator: String, limit: Double): js.Array[String] = js.native
  def split(str: String, separator: RegExp): js.Array[String] = js.native
  def split(str: String, separator: RegExp, limit: Double): js.Array[String] = js.native
  def test(str: String, regex: js.RegExp): Boolean = js.native
  def test(str: String, regex: js.RegExp, pos: Double): Boolean = js.native
  def test(str: String, regex: js.RegExp, pos: Double, sticky: Boolean): Boolean = js.native
  def uninstall(options: String): Unit = js.native
  def uninstall(options: js.Object): Unit = js.native
  def union(patterns: js.Array[String | js.RegExp]): js.RegExp = js.native
  def union(patterns: js.Array[String | js.RegExp], flags: String): js.RegExp = js.native
}

