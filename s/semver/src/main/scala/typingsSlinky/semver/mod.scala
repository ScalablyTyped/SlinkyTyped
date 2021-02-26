package typingsSlinky.semver

import typingsSlinky.semver.comparatorMod.^
import typingsSlinky.semver.semverNumbers.`-1`
import typingsSlinky.semver.semverNumbers.`0`
import typingsSlinky.semver.semverNumbers.`1`
import typingsSlinky.semver.semverStrings.Greaterthansign
import typingsSlinky.semver.semverStrings.Lessthansign
import typingsSlinky.semver.semverStrings.`2Dot0Dot0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("semver", "Comparator")
  @js.native
  class Comparator protected () extends ^ {
    def this(comp: String) = this()
    def this(comp: typingsSlinky.semver.comparatorMod.Comparator) = this()
    def this(comp: String, optionsOrLoose: Boolean) = this()
    def this(comp: String, optionsOrLoose: Options) = this()
    def this(comp: typingsSlinky.semver.comparatorMod.Comparator, optionsOrLoose: Boolean) = this()
    def this(comp: typingsSlinky.semver.comparatorMod.Comparator, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver", "Range")
  @js.native
  class Range protected ()
    extends typingsSlinky.semver.rangeMod.^ {
    def this(range: String) = this()
    def this(range: typingsSlinky.semver.rangeMod.Range) = this()
    def this(range: String, optionsOrLoose: Boolean) = this()
    def this(range: String, optionsOrLoose: Options) = this()
    def this(range: typingsSlinky.semver.rangeMod.Range, optionsOrLoose: Boolean) = this()
    def this(range: typingsSlinky.semver.rangeMod.Range, optionsOrLoose: Options) = this()
  }
  
  @JSImport("semver", "SEMVER_SPEC_VERSION")
  @js.native
  val SEMVER_SPEC_VERSION: `2Dot0Dot0` = js.native
  
  @JSImport("semver", "SemVer")
  @js.native
  class SemVer protected ()
    extends typingsSlinky.semver.semverMod.^ {
    def this(version: String) = this()
    def this(version: typingsSlinky.semver.semverMod.SemVer) = this()
    def this(version: String, optionsOrLoose: Boolean) = this()
    def this(version: String, optionsOrLoose: Options) = this()
    def this(version: typingsSlinky.semver.semverMod.SemVer, optionsOrLoose: Boolean) = this()
    def this(version: typingsSlinky.semver.semverMod.SemVer, optionsOrLoose: Options) = this()
  }
  
  /**
    * Returns cleaned (removed leading/trailing whitespace, remove '=v' prefix) and parsed version, or null if version is invalid.
    */
  @JSImport("semver", "clean")
  @js.native
  def clean(version: String): String | Null = js.native
  @JSImport("semver", "clean")
  @js.native
  def clean(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "clean")
  @js.native
  def clean(version: String, optionsOrLoose: Options): String | Null = js.native
  
  /**
    * Pass in a comparison string, and it'll call the corresponding semver comparison function.
    * "===" and "!==" do simple string comparison, but are included for completeness.
    * Throws if an invalid comparison string is provided.
    */
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: String, operator: Operator, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typingsSlinky.semver.semverMod.^, operator: Operator, v2: String): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typingsSlinky.semver.semverMod.^, operator: Operator, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typingsSlinky.semver.semverMod.^, operator: Operator, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(v1: typingsSlinky.semver.semverMod.^, operator: Operator, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(
    v1: typingsSlinky.semver.semverMod.^,
    operator: Operator,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "cmp")
  @js.native
  def cmp(
    v1: typingsSlinky.semver.semverMod.^,
    operator: Operator,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Coerces a string to SemVer if possible
    */
  @JSImport("semver", "coerce")
  @js.native
  def coerce(): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: js.UndefOr[scala.Nothing], options: CoerceOptions): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: String): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: String, options: CoerceOptions): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: Double): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: Double, options: CoerceOptions): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: Null, options: CoerceOptions): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: typingsSlinky.semver.semverMod.^): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "coerce")
  @js.native
  def coerce(version: typingsSlinky.semver.semverMod.^, options: CoerceOptions): typingsSlinky.semver.semverMod.^ | Null = js.native
  
  /**
    * Compares two versions excluding build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    */
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typingsSlinky.semver.semverMod.^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compare")
  @js.native
  def compare(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = js.native
  
  /**
    * Compares two versions including build identifiers (the bit after `+` in the semantic version string).
    *
    * Sorts in ascending order when passed to `Array.sort()`.
    *
    * @return
    * - `0` if `v1` == `v2`
    * - `1` if `v1` is greater
    * - `-1` if `v2` is greater.
    *
    * @since 6.1.0
    */
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: String, b: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: typingsSlinky.semver.semverMod.^, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareBuild")
  @js.native
  def compareBuild(a: typingsSlinky.semver.semverMod.^, b: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareIdentifiers")
  @js.native
  def compareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: String, v2: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: typingsSlinky.semver.semverMod.^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "compareLoose")
  @js.native
  def compareLoose(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  
  /**
    * Returns difference between two versions by the release type (major, premajor, minor, preminor, patch, prepatch, or prerelease), or null if the versions are the same.
    */
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: String): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: typingsSlinky.semver.semverMod.^): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typingsSlinky.semver.semverMod.^, v2: String): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): ReleaseType | Null = js.native
  @JSImport("semver", "diff")
  @js.native
  def diff(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): ReleaseType | Null = js.native
  
  /**
    * v1 == v2 This is true if they're logically equivalent, even if they're not the exact same string. You already know how to compare strings.
    */
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typingsSlinky.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "eq")
  @js.native
  def eq_(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * v1 > v2
    */
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typingsSlinky.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "gt")
  @js.native
  def gt(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * v1 >= v2
    */
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typingsSlinky.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "gte")
  @js.native
  def gte(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return true if version is greater than all the versions possible in the range.
    */
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: String): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: String, range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typingsSlinky.semver.semverMod.^, range: String): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(version: typingsSlinky.semver.semverMod.^, range: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "gtr")
  @js.native
  def gtr(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return the version incremented by the release type (major, minor, patch, or prerelease), or null if it's not valid.
    */
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: String,
    release: ReleaseType,
    optionsOrLoose: js.UndefOr[scala.Nothing],
    identifier: String
  ): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Boolean, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: String, release: ReleaseType, optionsOrLoose: Options, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typingsSlinky.semver.semverMod.^, release: ReleaseType): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typingsSlinky.semver.semverMod.^, release: ReleaseType, identifier: String): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: typingsSlinky.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: js.UndefOr[scala.Nothing],
    identifier: String
  ): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typingsSlinky.semver.semverMod.^, release: ReleaseType, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: typingsSlinky.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Boolean,
    identifier: String
  ): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(version: typingsSlinky.semver.semverMod.^, release: ReleaseType, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "inc")
  @js.native
  def inc(
    version: typingsSlinky.semver.semverMod.^,
    release: ReleaseType,
    optionsOrLoose: Options,
    identifier: String
  ): String | Null = js.native
  
  /**
    * Return true if any of the ranges comparators intersect
    */
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: String): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: String, range2: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typingsSlinky.semver.rangeMod.^, range2: String): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typingsSlinky.semver.rangeMod.^, range2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typingsSlinky.semver.rangeMod.^, range2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(range1: typingsSlinky.semver.rangeMod.^, range2: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(
    range1: typingsSlinky.semver.rangeMod.^,
    range2: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "intersects")
  @js.native
  def intersects(
    range1: typingsSlinky.semver.rangeMod.^,
    range2: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * v1 < v2
    */
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typingsSlinky.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "lt")
  @js.native
  def lt(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * v1 <= v2
    */
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typingsSlinky.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "lte")
  @js.native
  def lte(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return true if version is less than all the versions possible in the range.
    */
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: String): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: String, range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typingsSlinky.semver.semverMod.^, range: String): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(version: typingsSlinky.semver.semverMod.^, range: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "ltr")
  @js.native
  def ltr(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return the major version number.
    */
  @JSImport("semver", "major")
  @js.native
  def major(version: String): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: typingsSlinky.semver.semverMod.^): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "major")
  @js.native
  def major(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Double = js.native
  
  /**
    * Return the highest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "maxSatisfying")
  @js.native
  def maxSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
  
  /**
    * Return the lowest version in the list that satisfies the range, or null if none of them do.
    */
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: String): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: String, optionsOrLoose: Options): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): T | Null = js.native
  @JSImport("semver", "minSatisfying")
  @js.native
  def minSatisfying[T /* <: String | typingsSlinky.semver.semverMod.^ */](versions: js.Array[T], range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): T | Null = js.native
  
  /**
    * Return the lowest version that can possibly match the given range.
    */
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: String): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: String, optionsOrLoose: Boolean): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: String, optionsOrLoose: Options): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: typingsSlinky.semver.rangeMod.^): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "minVersion")
  @js.native
  def minVersion(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): typingsSlinky.semver.semverMod.^ | Null = js.native
  
  /**
    * Return the minor version number.
    */
  @JSImport("semver", "minor")
  @js.native
  def minor(version: String): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: typingsSlinky.semver.semverMod.^): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "minor")
  @js.native
  def minor(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Double = js.native
  
  /**
    * v1 != v2 The opposite of eq.
    */
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: String): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typingsSlinky.semver.semverMod.^, v2: String): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "neq")
  @js.native
  def neq(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return true if the version is outside the bounds of the range in either the high or low direction.
    * The hilo argument must be either the string '>' or '<'. (This is the function called by gtr and ltr.)
    */
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Greaterthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: String, hilo: Lessthansign, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typingsSlinky.semver.rangeMod.^, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: String,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Greaterthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: String,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Greaterthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: String, range: typingsSlinky.semver.rangeMod.^, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: String,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: String,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Lessthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typingsSlinky.semver.semverMod.^, range: String, hilo: Greaterthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Greaterthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Greaterthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(version: typingsSlinky.semver.semverMod.^, range: String, hilo: Lessthansign): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: String,
    hilo: Lessthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Greaterthansign
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Greaterthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Greaterthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Lessthansign
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Lessthansign,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "outside")
  @js.native
  def outside(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    hilo: Lessthansign,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return the parsed version as a SemVer object, or null if it's not valid.
    */
  @JSImport("semver", "parse")
  @js.native
  def parse(): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: String): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: String, optionsOrLoose: Boolean): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: String, optionsOrLoose: Options): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: Null, optionsOrLoose: Boolean): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: Null, optionsOrLoose: Options): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: typingsSlinky.semver.semverMod.^): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): typingsSlinky.semver.semverMod.^ | Null = js.native
  @JSImport("semver", "parse")
  @js.native
  def parse(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): typingsSlinky.semver.semverMod.^ | Null = js.native
  
  /**
    * Return the patch version number.
    */
  @JSImport("semver", "patch")
  @js.native
  def patch(version: String): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: String, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: String, optionsOrLoose: Options): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: typingsSlinky.semver.semverMod.^): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): Double = js.native
  @JSImport("semver", "patch")
  @js.native
  def patch(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): Double = js.native
  
  /**
    * Returns an array of prerelease components, or null if none exist.
    */
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: String): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: String, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: String, optionsOrLoose: Options): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: typingsSlinky.semver.semverMod.^): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): js.Array[String] | Null = js.native
  @JSImport("semver", "prerelease")
  @js.native
  def prerelease(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): js.Array[String] | Null = js.native
  
  /**
    * The reverse of compare.
    *
    * Sorts in descending order when passed to `Array.sort()`.
    */
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: String, v2: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typingsSlinky.semver.semverMod.^, v2: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Boolean): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typingsSlinky.semver.semverMod.^, v2: String, optionsOrLoose: Options): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(v1: typingsSlinky.semver.semverMod.^, v2: typingsSlinky.semver.semverMod.^): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Boolean
  ): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompare")
  @js.native
  def rcompare(
    v1: typingsSlinky.semver.semverMod.^,
    v2: typingsSlinky.semver.semverMod.^,
    optionsOrLoose: Options
  ): `1` | `0` | `-1` = js.native
  
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: js.UndefOr[scala.Nothing], b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: String, b: String): `1` | `0` | `-1` = js.native
  @JSImport("semver", "rcompareIdentifiers")
  @js.native
  def rcompareIdentifiers(a: Null, b: String): `1` | `0` | `-1` = js.native
  
  /**
    * Sorts an array of semver entries in descending order using `compareBuild()`.
    */
  @JSImport("semver", "rsort")
  @js.native
  def rsort[T /* <: String | typingsSlinky.semver.semverMod.^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver", "rsort")
  @js.native
  def rsort[T /* <: String | typingsSlinky.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver", "rsort")
  @js.native
  def rsort[T /* <: String | typingsSlinky.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  
  /**
    * Return true if the version satisfies the range.
    */
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: String): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: String, range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typingsSlinky.semver.semverMod.^, range: String): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Boolean): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typingsSlinky.semver.semverMod.^, range: String, optionsOrLoose: Options): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(version: typingsSlinky.semver.semverMod.^, range: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Boolean
  ): Boolean = js.native
  @JSImport("semver", "satisfies")
  @js.native
  def satisfies(
    version: typingsSlinky.semver.semverMod.^,
    range: typingsSlinky.semver.rangeMod.^,
    optionsOrLoose: Options
  ): Boolean = js.native
  
  /**
    * Return a "simplified" range that matches the same items in `versions` list as the range specified.
    * Note that it does *not* guarantee that it would match the same versions in all cases,
    * only for the set of versions provided.
    * This is useful when generating ranges by joining together multiple versions with `||` programmatically,
    * to provide the user with something a bit more ergonomic.
    * If the provided range is shorter in string-length than the generated range, then that is returned.
    */
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: String): String | typingsSlinky.semver.rangeMod.^ = js.native
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: String, options: Options): String | typingsSlinky.semver.rangeMod.^ = js.native
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: typingsSlinky.semver.rangeMod.^): String | typingsSlinky.semver.rangeMod.^ = js.native
  @JSImport("semver", "simplifyRange")
  @js.native
  def simplifyRange(ranges: js.Array[String], range: typingsSlinky.semver.rangeMod.^, options: Options): String | typingsSlinky.semver.rangeMod.^ = js.native
  
  /**
    * Sorts an array of semver entries in ascending order using `compareBuild()`.
    */
  @JSImport("semver", "sort")
  @js.native
  def sort[T /* <: String | typingsSlinky.semver.semverMod.^ */](list: js.Array[T]): js.Array[T] = js.native
  @JSImport("semver", "sort")
  @js.native
  def sort[T /* <: String | typingsSlinky.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Boolean): js.Array[T] = js.native
  @JSImport("semver", "sort")
  @js.native
  def sort[T /* <: String | typingsSlinky.semver.semverMod.^ */](list: js.Array[T], optionsOrLoose: Options): js.Array[T] = js.native
  
  /**
    * Return true if the subRange range is entirely contained by the superRange range.
    */
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: String): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: String, options: Options): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: String, dom: typingsSlinky.semver.rangeMod.^, options: Options): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typingsSlinky.semver.rangeMod.^, dom: String): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typingsSlinky.semver.rangeMod.^, dom: String, options: Options): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typingsSlinky.semver.rangeMod.^, dom: typingsSlinky.semver.rangeMod.^): Boolean = js.native
  @JSImport("semver", "subset")
  @js.native
  def subset(sub: typingsSlinky.semver.rangeMod.^, dom: typingsSlinky.semver.rangeMod.^, options: Options): Boolean = js.native
  
  /**
    * Mostly just for testing and legacy API reasons
    */
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: String): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: String, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: String, optionsOrLoose: Options): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: typingsSlinky.semver.rangeMod.^): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "toComparators")
  @js.native
  def toComparators(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): String = js.native
  
  /**
    * Return the parsed version as a string, or null if it's not valid.
    */
  @JSImport("semver", "valid")
  @js.native
  def valid(): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: String): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: String, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: String, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: Null, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: Null, optionsOrLoose: Options): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: typingsSlinky.semver.semverMod.^): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Boolean): String | Null = js.native
  @JSImport("semver", "valid")
  @js.native
  def valid(version: typingsSlinky.semver.semverMod.^, optionsOrLoose: Options): String | Null = js.native
  
  /**
    * Return the valid range or null if it's not valid
    */
  @JSImport("semver", "validRange")
  @js.native
  def validRange(): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: js.UndefOr[scala.Nothing], optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: js.UndefOr[scala.Nothing], optionsOrLoose: Options): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: String): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: String, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: String, optionsOrLoose: Options): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: Null, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: Null, optionsOrLoose: Options): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: typingsSlinky.semver.rangeMod.^): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Boolean): String = js.native
  @JSImport("semver", "validRange")
  @js.native
  def validRange(range: typingsSlinky.semver.rangeMod.^, optionsOrLoose: Options): String = js.native
  
  @js.native
  trait CoerceOptions extends Options {
    
    /**
      * Used by `coerce()` to coerce from right to left.
      *
      * @default false
      *
      * @example
      * coerce('1.2.3.4', { rtl: true });
      * // => SemVer { version: '2.3.4', ... }
      *
      * @since 6.2.0
      */
    var rtl: js.UndefOr[Boolean] = js.native
  }
  object CoerceOptions {
    
    @scala.inline
    def apply(): CoerceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CoerceOptions]
    }
    
    @scala.inline
    implicit class CoerceOptionsMutableBuilder[Self <: CoerceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.semver.semverStrings.EqualssignEqualssignEqualssign
    - typingsSlinky.semver.semverStrings.ExclamationmarkEqualssignEqualssign
    - typingsSlinky.semver.semverStrings._empty
    - typingsSlinky.semver.semverStrings.Equalssign
    - typingsSlinky.semver.semverStrings.EqualssignEqualssign
    - typingsSlinky.semver.semverStrings.ExclamationmarkEqualssign
    - typingsSlinky.semver.semverStrings.Greaterthansign
    - typingsSlinky.semver.semverStrings.GreaterthansignEqualssign
    - typingsSlinky.semver.semverStrings.Lessthansign
    - typingsSlinky.semver.semverStrings.LessthansignEqualssign
  */
  trait Operator extends StObject
  object Operator {
    
    @scala.inline
    def Equalssign: typingsSlinky.semver.semverStrings.Equalssign = "=".asInstanceOf[typingsSlinky.semver.semverStrings.Equalssign]
    
    @scala.inline
    def EqualssignEqualssign: typingsSlinky.semver.semverStrings.EqualssignEqualssign = "==".asInstanceOf[typingsSlinky.semver.semverStrings.EqualssignEqualssign]
    
    @scala.inline
    def EqualssignEqualssignEqualssign: typingsSlinky.semver.semverStrings.EqualssignEqualssignEqualssign = "===".asInstanceOf[typingsSlinky.semver.semverStrings.EqualssignEqualssignEqualssign]
    
    @scala.inline
    def ExclamationmarkEqualssign: typingsSlinky.semver.semverStrings.ExclamationmarkEqualssign = "!=".asInstanceOf[typingsSlinky.semver.semverStrings.ExclamationmarkEqualssign]
    
    @scala.inline
    def ExclamationmarkEqualssignEqualssign: typingsSlinky.semver.semverStrings.ExclamationmarkEqualssignEqualssign = "!==".asInstanceOf[typingsSlinky.semver.semverStrings.ExclamationmarkEqualssignEqualssign]
    
    @scala.inline
    def Greaterthansign: typingsSlinky.semver.semverStrings.Greaterthansign = ">".asInstanceOf[typingsSlinky.semver.semverStrings.Greaterthansign]
    
    @scala.inline
    def GreaterthansignEqualssign: typingsSlinky.semver.semverStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsSlinky.semver.semverStrings.GreaterthansignEqualssign]
    
    @scala.inline
    def Lessthansign: typingsSlinky.semver.semverStrings.Lessthansign = "<".asInstanceOf[typingsSlinky.semver.semverStrings.Lessthansign]
    
    @scala.inline
    def LessthansignEqualssign: typingsSlinky.semver.semverStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsSlinky.semver.semverStrings.LessthansignEqualssign]
    
    @scala.inline
    def _empty: typingsSlinky.semver.semverStrings._empty = "".asInstanceOf[typingsSlinky.semver.semverStrings._empty]
  }
  
  @js.native
  trait Options extends StObject {
    
    var includePrerelease: js.UndefOr[Boolean] = js.native
    
    var loose: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIncludePrerelease(value: Boolean): Self = StObject.set(x, "includePrerelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePrereleaseUndefined: Self = StObject.set(x, "includePrerelease", js.undefined)
      
      @scala.inline
      def setLoose(value: Boolean): Self = StObject.set(x, "loose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLooseUndefined: Self = StObject.set(x, "loose", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.semver.semverStrings.major
    - typingsSlinky.semver.semverStrings.premajor
    - typingsSlinky.semver.semverStrings.minor
    - typingsSlinky.semver.semverStrings.preminor
    - typingsSlinky.semver.semverStrings.patch
    - typingsSlinky.semver.semverStrings.prepatch
    - typingsSlinky.semver.semverStrings.prerelease
  */
  trait ReleaseType extends StObject
  object ReleaseType {
    
    @scala.inline
    def major: typingsSlinky.semver.semverStrings.major = "major".asInstanceOf[typingsSlinky.semver.semverStrings.major]
    
    @scala.inline
    def minor: typingsSlinky.semver.semverStrings.minor = "minor".asInstanceOf[typingsSlinky.semver.semverStrings.minor]
    
    @scala.inline
    def patch: typingsSlinky.semver.semverStrings.patch = "patch".asInstanceOf[typingsSlinky.semver.semverStrings.patch]
    
    @scala.inline
    def premajor: typingsSlinky.semver.semverStrings.premajor = "premajor".asInstanceOf[typingsSlinky.semver.semverStrings.premajor]
    
    @scala.inline
    def preminor: typingsSlinky.semver.semverStrings.preminor = "preminor".asInstanceOf[typingsSlinky.semver.semverStrings.preminor]
    
    @scala.inline
    def prepatch: typingsSlinky.semver.semverStrings.prepatch = "prepatch".asInstanceOf[typingsSlinky.semver.semverStrings.prepatch]
    
    @scala.inline
    def prerelease: typingsSlinky.semver.semverStrings.prerelease = "prerelease".asInstanceOf[typingsSlinky.semver.semverStrings.prerelease]
  }
}
