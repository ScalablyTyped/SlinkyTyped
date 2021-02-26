package typingsSlinky.semverDiff

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get the diff type of two [semver](https://github.com/npm/node-semver) versions: `0.0.1 0.0.2` → `patch`.
  @returns The difference type between two semver versions, or `undefined` if they're identical or the second one is lower than the first.
  @example
  ```
  import semverDiff = require('semver-diff');
  semverDiff('1.1.1', '1.1.2');
  //=> 'patch'
  semverDiff('1.1.1-foo', '1.1.2');
  //=> 'prepatch'
  semverDiff('0.0.1', '1.0.0');
  //=> 'major'
  semverDiff('0.0.1-foo', '1.0.0');
  //=> 'premajor'
  semverDiff('0.0.1', '0.1.0');
  //=> 'minor'
  semverDiff('0.0.1-foo', '0.1.0');
  //=> 'preminor'
  semverDiff('0.0.1-foo', '0.0.1-foo.bar');
  //=> 'prerelease'
  semverDiff('0.1.0', '0.1.0+foo');
  //=> 'build'
  semverDiff('0.0.1', '0.0.1');
  //=> undefined
  semverDiff('0.0.2', '0.0.1');
  //=> undefined
  ```
  */
  @JSImport("semver-diff", JSImport.Namespace)
  @js.native
  def apply(versionA: String, versionB: String): js.UndefOr[Result] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.semverDiff.semverDiffStrings.major
    - typingsSlinky.semverDiff.semverDiffStrings.premajor
    - typingsSlinky.semverDiff.semverDiffStrings.minor
    - typingsSlinky.semverDiff.semverDiffStrings.preminor
    - typingsSlinky.semverDiff.semverDiffStrings.patch
    - typingsSlinky.semverDiff.semverDiffStrings.prepatch
    - typingsSlinky.semverDiff.semverDiffStrings.prerelease
    - typingsSlinky.semverDiff.semverDiffStrings.build
  */
  trait Result extends StObject
  object Result {
    
    @scala.inline
    def build: typingsSlinky.semverDiff.semverDiffStrings.build = "build".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.build]
    
    @scala.inline
    def major: typingsSlinky.semverDiff.semverDiffStrings.major = "major".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.major]
    
    @scala.inline
    def minor: typingsSlinky.semverDiff.semverDiffStrings.minor = "minor".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.minor]
    
    @scala.inline
    def patch: typingsSlinky.semverDiff.semverDiffStrings.patch = "patch".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.patch]
    
    @scala.inline
    def premajor: typingsSlinky.semverDiff.semverDiffStrings.premajor = "premajor".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.premajor]
    
    @scala.inline
    def preminor: typingsSlinky.semverDiff.semverDiffStrings.preminor = "preminor".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.preminor]
    
    @scala.inline
    def prepatch: typingsSlinky.semverDiff.semverDiffStrings.prepatch = "prepatch".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.prepatch]
    
    @scala.inline
    def prerelease: typingsSlinky.semverDiff.semverDiffStrings.prerelease = "prerelease".asInstanceOf[typingsSlinky.semverDiff.semverDiffStrings.prerelease]
  }
}
