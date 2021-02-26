package typingsSlinky.webpackBugsnagPlugins

import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`bitbucket-server`
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`github-enterprise`
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.`gitlab-onpremise`
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.bitbucket
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.github
import typingsSlinky.webpackBugsnagPlugins.webpackBugsnagPluginsStrings.gitlab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Debug extends StObject {
    
    var debug: js.UndefOr[js.Any] = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var info: js.UndefOr[js.Any] = js.native
    
    var warn: js.UndefOr[js.Any] = js.native
  }
  object Debug {
    
    @scala.inline
    def apply(): Debug = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Debug]
    }
    
    @scala.inline
    implicit class DebugMutableBuilder[Self <: Debug] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: js.Any): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setWarn(value: js.Any): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
  
  @js.native
  trait Provider extends StObject {
    
    /**
      *  The source control provider.
      */
    var provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server` = js.native
    
    /**
      * A URL (git/ssh/https) pointing to the repository, or webpage representing
      * the repository
      */
    var repository: String = js.native
    
    /**
      * The unique identifier for the commit (e.g. git SHA)
      */
    var revision: String = js.native
  }
  object Provider {
    
    @scala.inline
    def apply(
      provider: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`,
      repository: String,
      revision: String
    ): Provider = {
      val __obj = js.Dynamic.literal(provider = provider.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProvider(value: github | `github-enterprise` | gitlab | `gitlab-onpremise` | bitbucket | `bitbucket-server`): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepository(value: String): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    }
  }
}
