package typingsSlinky.typeFest

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.typeFest.anon.DictmoduleName
import typingsSlinky.typeFest.anon.Email
import typingsSlinky.typeFest.anon.EmailUrl
import typingsSlinky.typeFest.anon.Type
import typingsSlinky.typeFest.anon.Url
import typingsSlinky.typeFest.literalUnionMod.LiteralUnion
import typingsSlinky.typeFest.packageJsonMod.PackageJson.BugsLocation
import typingsSlinky.typeFest.packageJsonMod.PackageJson.Dependency
import typingsSlinky.typeFest.packageJsonMod.PackageJson.DirectoryLocations
import typingsSlinky.typeFest.packageJsonMod.PackageJson.Person
import typingsSlinky.typeFest.packageJsonMod.PackageJson.Scripts
import typingsSlinky.typeFest.typeFestBooleans.`false`
import typingsSlinky.typeFest.typeFestStrings.Dot
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkaix
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkarm
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkarm64
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkdarwin
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkfreebsd
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkia32
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarklinux
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkmips
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkmipsel
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkopenbsd
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkppc
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkppc64
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarks390
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarks390x
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarksunos
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkwin32
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkx32
import typingsSlinky.typeFest.typeFestStrings.Exclamationmarkx64
import typingsSlinky.typeFest.typeFestStrings.aix
import typingsSlinky.typeFest.typeFestStrings.arm
import typingsSlinky.typeFest.typeFestStrings.arm64
import typingsSlinky.typeFest.typeFestStrings.darwin
import typingsSlinky.typeFest.typeFestStrings.freebsd
import typingsSlinky.typeFest.typeFestStrings.ia32
import typingsSlinky.typeFest.typeFestStrings.linux
import typingsSlinky.typeFest.typeFestStrings.mips
import typingsSlinky.typeFest.typeFestStrings.mipsel
import typingsSlinky.typeFest.typeFestStrings.openbsd
import typingsSlinky.typeFest.typeFestStrings.ppc
import typingsSlinky.typeFest.typeFestStrings.ppc64
import typingsSlinky.typeFest.typeFestStrings.s390
import typingsSlinky.typeFest.typeFestStrings.s390x
import typingsSlinky.typeFest.typeFestStrings.sunos
import typingsSlinky.typeFest.typeFestStrings.win32
import typingsSlinky.typeFest.typeFestStrings.x32
import typingsSlinky.typeFest.typeFestStrings.x64
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageJsonMod {
  
  /* Inlined {  name :string | undefined,   version :string | undefined,   description :string | undefined,   keywords :std.Array<string> | undefined,   homepage :type-fest.type-fest.LiteralUnion<'.', string> | undefined,   bugs :type-fest.type-fest/source/package-json.PackageJson.BugsLocation | undefined,   license :string | undefined,   licenses :std.Array<{  type :string | undefined,   url :string | undefined}> | undefined,   author :type-fest.type-fest/source/package-json.PackageJson.Person | undefined,   contributors :std.Array<type-fest.type-fest/source/package-json.PackageJson.Person> | undefined,   maintainers :std.Array<type-fest.type-fest/source/package-json.PackageJson.Person> | undefined,   files :std.Array<string> | undefined,   main :string | undefined,   bin :string | {[binary: string] : string} | undefined,   man :string | std.Array<string> | undefined,   directories :type-fest.type-fest/source/package-json.PackageJson.DirectoryLocations | undefined,   repository :string | {  type :string,   url :string} | undefined,   scripts :type-fest.type-fest/source/package-json.PackageJson.Scripts | undefined,   config :{[configKey: string] : unknown} | undefined,   dependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   devDependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   optionalDependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   peerDependencies :type-fest.type-fest/source/package-json.PackageJson.Dependency | undefined,   bundledDependencies :std.Array<string> | undefined,   bundleDependencies :std.Array<string> | undefined,   engines :{[ EngineName in 'npm' | 'node' | string ]: string} | undefined,   engineStrict :boolean | undefined,   os :std.Array<type-fest.type-fest.LiteralUnion<'aix' | 'darwin' | 'freebsd' | 'linux' | 'openbsd' | 'sunos' | 'win32' | '!aix' | '!darwin' | '!freebsd' | '!linux' | '!openbsd' | '!sunos' | '!win32', string>> | undefined,   cpu :std.Array<type-fest.type-fest.LiteralUnion<'arm' | 'arm64' | 'ia32' | 'mips' | 'mipsel' | 'ppc' | 'ppc64' | 's390' | 's390x' | 'x32' | 'x64' | '!arm' | '!arm64' | '!ia32' | '!mips' | '!mipsel' | '!ppc' | '!ppc64' | '!s390' | '!s390x' | '!x32' | '!x64', string>> | undefined,   preferGlobal :boolean | undefined,   private :boolean | undefined,   publishConfig :{[config: string] : unknown} | undefined, [key: string] : unknown} & type-fest.type-fest/source/package-json.PackageJson.NonStandardEntryPoints & type-fest.type-fest/source/package-json.PackageJson.TypeScriptConfiguration & type-fest.type-fest/source/package-json.PackageJson.YarnConfiguration & type-fest.type-fest/source/package-json.PackageJson.JSPMConfiguration */
  @js.native
  trait PackageJson
    extends /* key */ StringDictionary[js.Any] {
    
    var author: js.UndefOr[Person] = js.native
    
    /**
    	The executable files that should be installed into the `PATH`.
    	*/
    var bin: js.UndefOr[String | StringDictionary[String]] = js.native
    
    /**
    		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
    		*/
    var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.native
    
    /**
    	The URL to the package's issue tracker and/or the email address to which issues should be reported.
    	*/
    var bugs: js.UndefOr[BugsLocation] = js.native
    
    /**
    	Alias of `bundledDependencies`.
    	*/
    var bundleDependencies: js.UndefOr[js.Array[String]] = js.native
    
    /**
    	Package names that are bundled when the package is published.
    	*/
    var bundledDependencies: js.UndefOr[js.Array[String]] = js.native
    
    /**
    	Is used to set configuration parameters used in package scripts that persist across upgrades.
    	*/
    var config: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
    	A list of people who contributed to the package.
    	*/
    var contributors: js.UndefOr[js.Array[Person]] = js.native
    
    /**
    	CPU architectures the module runs on.
    	*/
    var cpu: js.UndefOr[
        js.Array[
          LiteralUnion[
            arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
            String
          ]
        ]
      ] = js.native
    
    /**
    	The dependencies of the package.
    	*/
    var dependencies: js.UndefOr[Dependency] = js.native
    
    /**
    	Package description, listed in `npm search`.
    	*/
    var description: js.UndefOr[String] = js.native
    
    /**
    	Additional tooling dependencies that are not required for the package to work. Usually test, build, or documentation tooling.
    	*/
    var devDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    	Indicates the structure of the package.
    	*/
    var directories: js.UndefOr[DirectoryLocations] = js.native
    
    /**
    	@deprecated
    	*/
    var engineStrict: js.UndefOr[Boolean] = js.native
    
    /**
    	Engines that this package runs on.
    	*/
    var engines: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ EngineName in 'npm' | 'node' | string ]: string}
      */ typingsSlinky.typeFest.typeFestStrings.PackageJson with TopLevel[js.Any]
      ] = js.native
    
    /**
    		A module ID with untranspiled code that is the primary entry point to the program.
    		*/
    var esnext: js.UndefOr[String | DictmoduleName] = js.native
    
    /**
    	The files included in the package.
    	*/
    var files: js.UndefOr[js.Array[String]] = js.native
    
    /**
    		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
    		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
    		*/
    var flat: js.UndefOr[Boolean] = js.native
    
    /**
    	The URL to the package's homepage.
    	*/
    var homepage: js.UndefOr[LiteralUnion[Dot, String]] = js.native
    
    /**
    		JSPM configuration.
    		*/
    var jspm: js.UndefOr[PackageJson] = js.native
    
    /**
    	Keywords associated with package, listed in `npm search`.
    	*/
    var keywords: js.UndefOr[js.Array[String]] = js.native
    
    /**
    	The license for the package.
    	*/
    var license: js.UndefOr[String] = js.native
    
    /**
    	The licenses for the package.
    	*/
    var licenses: js.UndefOr[js.Array[Type]] = js.native
    
    /**
    	The module ID that is the primary entry point to the program.
    	*/
    var main: js.UndefOr[String] = js.native
    
    /**
    	A list of people who maintain the package.
    	*/
    var maintainers: js.UndefOr[js.Array[Person]] = js.native
    
    /**
    	Filenames to put in place for the `man` program to find.
    	*/
    var man: js.UndefOr[String | js.Array[String]] = js.native
    
    /**
    		An ECMAScript module ID that is the primary entry point to the program.
    		*/
    var module: js.UndefOr[String] = js.native
    
    /**
    	The name of the package.
    	*/
    var name: js.UndefOr[String] = js.native
    
    /**
    	Dependencies that are skipped if they fail to install.
    	*/
    var optionalDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    	Operating systems the module runs on.
    	*/
    var os: js.UndefOr[
        js.Array[
          LiteralUnion[
            aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
            String
          ]
        ]
      ] = js.native
    
    /**
    	Dependencies that will usually be required by the package user directly or via another dependency.
    	*/
    var peerDependencies: js.UndefOr[Dependency] = js.native
    
    /**
    	If set to `true`, a warning will be shown if package is installed locally. Useful if the package is primarily a command-line application that should be installed globally.
    	@deprecated
    	*/
    var preferGlobal: js.UndefOr[Boolean] = js.native
    
    /**
    	If set to `true`, then npm will refuse to publish it.
    	*/
    var `private`: js.UndefOr[Boolean] = js.native
    
    /**
    	 * A set of config values that will be used at publish-time. It's especially handy to set the tag, registry or access, to ensure that a given package is not tagged with 'latest', published to the global public registry or that a scoped module is private by default.
    	 */
    var publishConfig: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /**
    	Location for the code repository.
    	*/
    var repository: js.UndefOr[String | Url] = js.native
    
    /**
    		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
    		*/
    var resolutions: js.UndefOr[Dependency] = js.native
    
    /**
    	Script commands that are run at various times in the lifecycle of the package. The key is the lifecycle event, and the value is the command to run at that point.
    	*/
    var scripts: js.UndefOr[Scripts] = js.native
    
    /**
    		Location of the bundled TypeScript declaration file.
    		*/
    var types: js.UndefOr[String] = js.native
    
    /**
    		Location of the bundled TypeScript declaration file. Alias of `types`.
    		*/
    var typings: js.UndefOr[String] = js.native
    
    /**
    	Package version, parseable by [`node-semver`](https://github.com/npm/node-semver).
    	*/
    var version: js.UndefOr[String] = js.native
  }
  object PackageJson {
    
    @scala.inline
    def apply(): PackageJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJson]
    }
    
    type BugsLocation = String | EmailUrl
    
    type Dependency = StringDictionary[String]
    
    @js.native
    trait DirectoryLocations
      extends /* key */ StringDictionary[js.Any] {
      
      /**
      		Location for executable scripts. Sugar to generate entries in the `bin` property by walking the folder.
      		*/
      var bin: js.UndefOr[String] = js.native
      
      /**
      		Location for Markdown files.
      		*/
      var doc: js.UndefOr[String] = js.native
      
      /**
      		Location for example scripts.
      		*/
      var example: js.UndefOr[String] = js.native
      
      /**
      		Location for the bulk of the library.
      		*/
      var lib: js.UndefOr[String] = js.native
      
      /**
      		Location for man pages. Sugar to generate a `man` array by walking the folder.
      		*/
      var man: js.UndefOr[String] = js.native
      
      /**
      		Location for test files.
      		*/
      var test: js.UndefOr[String] = js.native
    }
    object DirectoryLocations {
      
      @scala.inline
      def apply(): DirectoryLocations = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[DirectoryLocations]
      }
      
      @scala.inline
      implicit class DirectoryLocationsMutableBuilder[Self <: DirectoryLocations] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
        
        @scala.inline
        def setDoc(value: String): Self = StObject.set(x, "doc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDocUndefined: Self = StObject.set(x, "doc", js.undefined)
        
        @scala.inline
        def setExample(value: String): Self = StObject.set(x, "example", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExampleUndefined: Self = StObject.set(x, "example", js.undefined)
        
        @scala.inline
        def setLib(value: String): Self = StObject.set(x, "lib", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLibUndefined: Self = StObject.set(x, "lib", js.undefined)
        
        @scala.inline
        def setMan(value: String): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setManUndefined: Self = StObject.set(x, "man", js.undefined)
        
        @scala.inline
        def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      }
    }
    
    @js.native
    trait JSPMConfiguration extends StObject {
      
      /**
      		JSPM configuration.
      		*/
      var jspm: js.UndefOr[PackageJson] = js.native
    }
    object JSPMConfiguration {
      
      @scala.inline
      def apply(): JSPMConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[JSPMConfiguration]
      }
      
      @scala.inline
      implicit class JSPMConfigurationMutableBuilder[Self <: JSPMConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setJspm(value: PackageJson): Self = StObject.set(x, "jspm", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJspmUndefined: Self = StObject.set(x, "jspm", js.undefined)
      }
    }
    
    @js.native
    trait NonStandardEntryPoints extends StObject {
      
      /**
      		A hint to JavaScript bundlers or component tools when packaging modules for client side use.
      		*/
      var browser: js.UndefOr[String | (StringDictionary[String | `false`])] = js.native
      
      /**
      		A module ID with untranspiled code that is the primary entry point to the program.
      		*/
      var esnext: js.UndefOr[String | DictmoduleName] = js.native
      
      /**
      		An ECMAScript module ID that is the primary entry point to the program.
      		*/
      var module: js.UndefOr[String] = js.native
    }
    object NonStandardEntryPoints {
      
      @scala.inline
      def apply(): NonStandardEntryPoints = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[NonStandardEntryPoints]
      }
      
      @scala.inline
      implicit class NonStandardEntryPointsMutableBuilder[Self <: NonStandardEntryPoints] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBrowser(value: String | (StringDictionary[String | `false`])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
        
        @scala.inline
        def setEsnext(value: String | DictmoduleName): Self = StObject.set(x, "esnext", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEsnextUndefined: Self = StObject.set(x, "esnext", js.undefined)
        
        @scala.inline
        def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      }
    }
    
    @scala.inline
    implicit class PackageJsonMutableBuilder[Self <: PackageJson] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: Person): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setBin(value: String | StringDictionary[String]): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinUndefined: Self = StObject.set(x, "bin", js.undefined)
      
      @scala.inline
      def setBrowser(value: String | (StringDictionary[String | `false`])): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setBugs(value: BugsLocation): Self = StObject.set(x, "bugs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBugsUndefined: Self = StObject.set(x, "bugs", js.undefined)
      
      @scala.inline
      def setBundleDependencies(value: js.Array[String]): Self = StObject.set(x, "bundleDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundleDependenciesUndefined: Self = StObject.set(x, "bundleDependencies", js.undefined)
      
      @scala.inline
      def setBundleDependenciesVarargs(value: String*): Self = StObject.set(x, "bundleDependencies", js.Array(value :_*))
      
      @scala.inline
      def setBundledDependencies(value: js.Array[String]): Self = StObject.set(x, "bundledDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundledDependenciesUndefined: Self = StObject.set(x, "bundledDependencies", js.undefined)
      
      @scala.inline
      def setBundledDependenciesVarargs(value: String*): Self = StObject.set(x, "bundledDependencies", js.Array(value :_*))
      
      @scala.inline
      def setConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      @scala.inline
      def setContributors(value: js.Array[Person]): Self = StObject.set(x, "contributors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContributorsUndefined: Self = StObject.set(x, "contributors", js.undefined)
      
      @scala.inline
      def setContributorsVarargs(value: Person*): Self = StObject.set(x, "contributors", js.Array(value :_*))
      
      @scala.inline
      def setCpu(
        value: js.Array[
              LiteralUnion[
                arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
                String
              ]
            ]
      ): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCpuUndefined: Self = StObject.set(x, "cpu", js.undefined)
      
      @scala.inline
      def setCpuVarargs(
        value: (LiteralUnion[
              arm | arm64 | ia32 | mips | mipsel | ppc | ppc64 | s390 | s390x | x32 | x64 | Exclamationmarkarm | Exclamationmarkarm64 | Exclamationmarkia32 | Exclamationmarkmips | Exclamationmarkmipsel | Exclamationmarkppc | Exclamationmarkppc64 | Exclamationmarks390 | Exclamationmarks390x | Exclamationmarkx32 | Exclamationmarkx64, 
              String
            ])*
      ): Self = StObject.set(x, "cpu", js.Array(value :_*))
      
      @scala.inline
      def setDependencies(value: Dependency): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDevDependencies(value: Dependency): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      @scala.inline
      def setDirectories(value: DirectoryLocations): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      @scala.inline
      def setEngineStrict(value: Boolean): Self = StObject.set(x, "engineStrict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEngineStrictUndefined: Self = StObject.set(x, "engineStrict", js.undefined)
      
      @scala.inline
      def setEngines(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ EngineName in 'npm' | 'node' | string ]: string}
        */ typingsSlinky.typeFest.typeFestStrings.PackageJson with TopLevel[js.Any]
      ): Self = StObject.set(x, "engines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnginesUndefined: Self = StObject.set(x, "engines", js.undefined)
      
      @scala.inline
      def setEsnext(value: String | DictmoduleName): Self = StObject.set(x, "esnext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEsnextUndefined: Self = StObject.set(x, "esnext", js.undefined)
      
      @scala.inline
      def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      @scala.inline
      def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value :_*))
      
      @scala.inline
      def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      @scala.inline
      def setHomepage(value: LiteralUnion[Dot, String]): Self = StObject.set(x, "homepage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHomepageUndefined: Self = StObject.set(x, "homepage", js.undefined)
      
      @scala.inline
      def setJspm(value: PackageJson): Self = StObject.set(x, "jspm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJspmUndefined: Self = StObject.set(x, "jspm", js.undefined)
      
      @scala.inline
      def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeywordsUndefined: Self = StObject.set(x, "keywords", js.undefined)
      
      @scala.inline
      def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value :_*))
      
      @scala.inline
      def setLicense(value: String): Self = StObject.set(x, "license", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseUndefined: Self = StObject.set(x, "license", js.undefined)
      
      @scala.inline
      def setLicenses(value: js.Array[Type]): Self = StObject.set(x, "licenses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicensesUndefined: Self = StObject.set(x, "licenses", js.undefined)
      
      @scala.inline
      def setLicensesVarargs(value: Type*): Self = StObject.set(x, "licenses", js.Array(value :_*))
      
      @scala.inline
      def setMain(value: String): Self = StObject.set(x, "main", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMainUndefined: Self = StObject.set(x, "main", js.undefined)
      
      @scala.inline
      def setMaintainers(value: js.Array[Person]): Self = StObject.set(x, "maintainers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaintainersUndefined: Self = StObject.set(x, "maintainers", js.undefined)
      
      @scala.inline
      def setMaintainersVarargs(value: Person*): Self = StObject.set(x, "maintainers", js.Array(value :_*))
      
      @scala.inline
      def setMan(value: String | js.Array[String]): Self = StObject.set(x, "man", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManUndefined: Self = StObject.set(x, "man", js.undefined)
      
      @scala.inline
      def setManVarargs(value: String*): Self = StObject.set(x, "man", js.Array(value :_*))
      
      @scala.inline
      def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOptionalDependencies(value: Dependency): Self = StObject.set(x, "optionalDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionalDependenciesUndefined: Self = StObject.set(x, "optionalDependencies", js.undefined)
      
      @scala.inline
      def setOs(
        value: js.Array[
              LiteralUnion[
                aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
                String
              ]
            ]
      ): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOsUndefined: Self = StObject.set(x, "os", js.undefined)
      
      @scala.inline
      def setOsVarargs(
        value: (LiteralUnion[
              aix | darwin | freebsd | linux | openbsd | sunos | win32 | Exclamationmarkaix | Exclamationmarkdarwin | Exclamationmarkfreebsd | Exclamationmarklinux | Exclamationmarkopenbsd | Exclamationmarksunos | Exclamationmarkwin32, 
              String
            ])*
      ): Self = StObject.set(x, "os", js.Array(value :_*))
      
      @scala.inline
      def setPeerDependencies(value: Dependency): Self = StObject.set(x, "peerDependencies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeerDependenciesUndefined: Self = StObject.set(x, "peerDependencies", js.undefined)
      
      @scala.inline
      def setPreferGlobal(value: Boolean): Self = StObject.set(x, "preferGlobal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferGlobalUndefined: Self = StObject.set(x, "preferGlobal", js.undefined)
      
      @scala.inline
      def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
      
      @scala.inline
      def setPublishConfig(value: StringDictionary[js.Any]): Self = StObject.set(x, "publishConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishConfigUndefined: Self = StObject.set(x, "publishConfig", js.undefined)
      
      @scala.inline
      def setRepository(value: String | Url): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      @scala.inline
      def setResolutions(value: Dependency): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      
      @scala.inline
      def setScripts(value: Scripts): Self = StObject.set(x, "scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScriptsUndefined: Self = StObject.set(x, "scripts", js.undefined)
      
      @scala.inline
      def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypings(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypingsUndefined: Self = StObject.set(x, "typings", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
    
    type Person = String | Email
    
    @js.native
    trait Scripts extends /* scriptName */ StringDictionary[String] {
      
      /**
      		Run **after** the package is installed.
      		*/
      var install: js.UndefOr[String] = js.native
      
      /**
      		Run **after** the package is installed and after `install`.
      		*/
      var postinstall: js.UndefOr[String] = js.native
      
      /**
      		Run **after** the tarball has been generated and moved to its final destination.
      		*/
      var postpack: js.UndefOr[String] = js.native
      
      /**
      		Run **after** the package is published.
      		*/
      var postpublish: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm restart` command, after `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      		*/
      var postrestart: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm start` command, after `start`.
      		*/
      var poststart: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm stop` command, after `stop`.
      		*/
      var poststop: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm test` command, after `test`.
      		*/
      var posttest: js.UndefOr[String] = js.native
      
      /**
      		Run **after** the package is uninstalled.
      		*/
      var postuninstall: js.UndefOr[String] = js.native
      
      /**
      		Run **after** bump the package version.
      		*/
      var postversion: js.UndefOr[String] = js.native
      
      /**
      		Run **before** the package is installed.
      		*/
      var preinstall: js.UndefOr[String] = js.native
      
      /**
      		Run **before** a tarball is packed (on `npm pack`, `npm publish`, and when installing git dependencies).
      		*/
      var prepack: js.UndefOr[String] = js.native
      
      /**
      		Run both **before** the package is packed and published, and on local `npm install` without any arguments. This is run **after** `prepublish`, but **before** `prepublishOnly`.
      		*/
      var prepare: js.UndefOr[String] = js.native
      
      /**
      		Run **before** the package is published (Also run on local `npm install` without any arguments).
      		*/
      var prepublish: js.UndefOr[String] = js.native
      
      /**
      		Run **before** the package is prepared and packed, **only** on `npm publish`.
      		*/
      var prepublishOnly: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm restart` command, before `restart`. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      		*/
      var prerestart: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm start` command, before `start`.
      		*/
      var prestart: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm stop` command, before `stop`.
      		*/
      var prestop: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm test` command, before `test`.
      		*/
      var pretest: js.UndefOr[String] = js.native
      
      /**
      		Run **before** the package is uninstalled and before `uninstall`.
      		*/
      var preuninstall: js.UndefOr[String] = js.native
      
      /**
      		Run **before** bump the package version and before `version`.
      		*/
      var preversion: js.UndefOr[String] = js.native
      
      /**
      		Run **after** the package is published.
      		*/
      var publish: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm restart` command. Note: `npm restart` will run the `stop` and `start` scripts if no `restart` script is provided.
      		*/
      var restart: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm start` command.
      		*/
      var start: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm stop` command.
      		*/
      var stop: js.UndefOr[String] = js.native
      
      /**
      		Run with the `npm test` command.
      		*/
      var test: js.UndefOr[String] = js.native
      
      /**
      		Run **before** the package is uninstalled.
      		*/
      var uninstall: js.UndefOr[String] = js.native
      
      /**
      		Run **before** bump the package version.
      		*/
      var version: js.UndefOr[String] = js.native
    }
    object Scripts {
      
      @scala.inline
      def apply(): Scripts = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Scripts]
      }
      
      @scala.inline
      implicit class ScriptsMutableBuilder[Self <: Scripts] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setInstall(value: String): Self = StObject.set(x, "install", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInstallUndefined: Self = StObject.set(x, "install", js.undefined)
        
        @scala.inline
        def setPostinstall(value: String): Self = StObject.set(x, "postinstall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostinstallUndefined: Self = StObject.set(x, "postinstall", js.undefined)
        
        @scala.inline
        def setPostpack(value: String): Self = StObject.set(x, "postpack", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostpackUndefined: Self = StObject.set(x, "postpack", js.undefined)
        
        @scala.inline
        def setPostpublish(value: String): Self = StObject.set(x, "postpublish", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostpublishUndefined: Self = StObject.set(x, "postpublish", js.undefined)
        
        @scala.inline
        def setPostrestart(value: String): Self = StObject.set(x, "postrestart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostrestartUndefined: Self = StObject.set(x, "postrestart", js.undefined)
        
        @scala.inline
        def setPoststart(value: String): Self = StObject.set(x, "poststart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPoststartUndefined: Self = StObject.set(x, "poststart", js.undefined)
        
        @scala.inline
        def setPoststop(value: String): Self = StObject.set(x, "poststop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPoststopUndefined: Self = StObject.set(x, "poststop", js.undefined)
        
        @scala.inline
        def setPosttest(value: String): Self = StObject.set(x, "posttest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPosttestUndefined: Self = StObject.set(x, "posttest", js.undefined)
        
        @scala.inline
        def setPostuninstall(value: String): Self = StObject.set(x, "postuninstall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostuninstallUndefined: Self = StObject.set(x, "postuninstall", js.undefined)
        
        @scala.inline
        def setPostversion(value: String): Self = StObject.set(x, "postversion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPostversionUndefined: Self = StObject.set(x, "postversion", js.undefined)
        
        @scala.inline
        def setPreinstall(value: String): Self = StObject.set(x, "preinstall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreinstallUndefined: Self = StObject.set(x, "preinstall", js.undefined)
        
        @scala.inline
        def setPrepack(value: String): Self = StObject.set(x, "prepack", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrepackUndefined: Self = StObject.set(x, "prepack", js.undefined)
        
        @scala.inline
        def setPrepare(value: String): Self = StObject.set(x, "prepare", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrepareUndefined: Self = StObject.set(x, "prepare", js.undefined)
        
        @scala.inline
        def setPrepublish(value: String): Self = StObject.set(x, "prepublish", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrepublishOnly(value: String): Self = StObject.set(x, "prepublishOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrepublishOnlyUndefined: Self = StObject.set(x, "prepublishOnly", js.undefined)
        
        @scala.inline
        def setPrepublishUndefined: Self = StObject.set(x, "prepublish", js.undefined)
        
        @scala.inline
        def setPrerestart(value: String): Self = StObject.set(x, "prerestart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrerestartUndefined: Self = StObject.set(x, "prerestart", js.undefined)
        
        @scala.inline
        def setPrestart(value: String): Self = StObject.set(x, "prestart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrestartUndefined: Self = StObject.set(x, "prestart", js.undefined)
        
        @scala.inline
        def setPrestop(value: String): Self = StObject.set(x, "prestop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrestopUndefined: Self = StObject.set(x, "prestop", js.undefined)
        
        @scala.inline
        def setPretest(value: String): Self = StObject.set(x, "pretest", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPretestUndefined: Self = StObject.set(x, "pretest", js.undefined)
        
        @scala.inline
        def setPreuninstall(value: String): Self = StObject.set(x, "preuninstall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreuninstallUndefined: Self = StObject.set(x, "preuninstall", js.undefined)
        
        @scala.inline
        def setPreversion(value: String): Self = StObject.set(x, "preversion", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPreversionUndefined: Self = StObject.set(x, "preversion", js.undefined)
        
        @scala.inline
        def setPublish(value: String): Self = StObject.set(x, "publish", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPublishUndefined: Self = StObject.set(x, "publish", js.undefined)
        
        @scala.inline
        def setRestart(value: String): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRestartUndefined: Self = StObject.set(x, "restart", js.undefined)
        
        @scala.inline
        def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
        
        @scala.inline
        def setStop(value: String): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
        
        @scala.inline
        def setTest(value: String): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
        
        @scala.inline
        def setUninstall(value: String): Self = StObject.set(x, "uninstall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUninstallUndefined: Self = StObject.set(x, "uninstall", js.undefined)
        
        @scala.inline
        def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      }
    }
    
    @js.native
    trait TypeScriptConfiguration extends StObject {
      
      /**
      		Location of the bundled TypeScript declaration file.
      		*/
      var types: js.UndefOr[String] = js.native
      
      /**
      		Location of the bundled TypeScript declaration file. Alias of `types`.
      		*/
      var typings: js.UndefOr[String] = js.native
    }
    object TypeScriptConfiguration {
      
      @scala.inline
      def apply(): TypeScriptConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TypeScriptConfiguration]
      }
      
      @scala.inline
      implicit class TypeScriptConfigurationMutableBuilder[Self <: TypeScriptConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTypes(value: String): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
        
        @scala.inline
        def setTypings(value: String): Self = StObject.set(x, "typings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypingsUndefined: Self = StObject.set(x, "typings", js.undefined)
      }
    }
    
    @js.native
    trait YarnConfiguration extends StObject {
      
      /**
      		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
      		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
      		*/
      var flat: js.UndefOr[Boolean] = js.native
      
      /**
      		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
      		*/
      var resolutions: js.UndefOr[Dependency] = js.native
    }
    object YarnConfiguration {
      
      @scala.inline
      def apply(): YarnConfiguration = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[YarnConfiguration]
      }
      
      @scala.inline
      implicit class YarnConfigurationMutableBuilder[Self <: YarnConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
        
        @scala.inline
        def setResolutions(value: Dependency): Self = StObject.set(x, "resolutions", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResolutionsUndefined: Self = StObject.set(x, "resolutions", js.undefined)
      }
    }
  }
}
