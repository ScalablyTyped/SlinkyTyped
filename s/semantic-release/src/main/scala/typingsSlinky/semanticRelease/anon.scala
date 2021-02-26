package typingsSlinky.semanticRelease

import typingsSlinky.semanticRelease.mod.Commit
import typingsSlinky.semanticRelease.mod.LastRelease
import typingsSlinky.semanticRelease.mod.NextRelease
import typingsSlinky.semanticRelease.mod.Release
import typingsSlinky.semanticRelease.mod.Result
import typingsSlinky.semanticRelease.semanticReleaseBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Channel extends StObject {
    
    /**
      * The distribution channel on which to publish releases from this
      * branch.
      *
      * If this field is set to `false`, then the branch will be released
      * on the default distribution channel (for example the `@latest`
      * [dist-tag](https://docs.npmjs.com/cli/dist-tag) for npm). This is
      * also the default behavior for the first
      * [release branch](https://semantic-release.gitbook.io/semantic-release/usage/workflow-configuration#release-branches)
      * if the channel property is not set.
      *
      * For all other branches, if the channel property is not set, then the
      * channel name will be the same as the branch name.
      *
      * The value of `channel`, if defined as a string, is generated with
      * [Lodash template](https://lodash.com/docs#template) with the
      * variable `name` set to the branch name.
      *
      * For example `{name: 'next', channel: 'channel-${name}'}` will be
      * expanded to `{name: 'next', channel: 'channel-next'}`.
      */
    var channel: js.UndefOr[String | `false`] = js.native
    
    /**
      * The name of git branch.
      *
      * A `name` is required for all types of branch. It can be defined as a
      * [glob](https://github.com/micromatch/micromatch#matching-features)
      * in which case the definition will be expanded to one per matching
      * branch existing in the repository.
      *
      * If `name` doesn't match any branch existing in the repository, the
      * definition will be ignored. For example, the default configuration
      * includes the definition `next` and `next-major` which will become
      * active only  when the branches `next` and/or `next-major` are
      * created in the repository.
      */
    var name: String = js.native
    
    /**
      * The pre-release identifier to append to [semantic versions](https://semver.org/)
      * released from this branch.
      *
      * A `prerelease` property applies only to pre-release branches and
      * the `prerelease` value must be valid per the [Semantic Versioning
      * Specification](https://semver.org/#spec-item-9). It will determine
      * the name of versions. For example if `prerelease` is set to
      * `"beta"`, the version will be formatted like `2.0.0-beta.1`,
      * `2.0.0-beta.2`, etc.
      *
      * The value of `prerelease`, if defined as a string, is generated with
      * [Lodash template](https://lodash.com/docs#template) with the
      * variable `name` set to the name of the branch.
      *
      * If the `prerelease property is set to `true` then the name of the
      * branch is used as the pre-release identifier.
      *
      * Required for pre-release branches.
      */
    var prerelease: js.UndefOr[String | Boolean] = js.native
    
    /**
      * The range of [semantic versions](https://semver.org/) to support on
      * this branch.
      *
      * A `range` only applies to maintenance branches and must be formatted
      * like `N.N.x` or `N.x` (`N` is a number). If no range is specified
      * but the `name` is formatted as a range, then the branch will be
      * considered a maintenance branch and the `name` value will be used
      * for the `range`.
      *
      * Required for maintenance branches, unless `name` is formatted like
      * `N.N.x` or `N.x` (`N` is a number).
      */
    var range: js.UndefOr[String] = js.native
  }
  object Channel {
    
    @scala.inline
    def apply(name: String): Channel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Channel]
    }
    
    @scala.inline
    implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String | `false`): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrerelease(value: String | Boolean): Self = StObject.set(x, "prerelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrereleaseUndefined: Self = StObject.set(x, "prerelease", js.undefined)
      
      @scala.inline
      def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  @js.native
  trait Commits extends Result {
    
    /**
      * The list of commits included in the new release.
      */
    var commits: js.Array[Commit] = js.native
    
    /**
      * Information related to the last release found.
      */
    var lastRelease: LastRelease = js.native
    
    /**
      * Information related to the newly published release.
      */
    var nextRelease: NextRelease = js.native
    
    /**
      * The list of releases published, one release per publish plugin.
      */
    var releases: js.Array[Release] = js.native
  }
  object Commits {
    
    @scala.inline
    def apply(
      commits: js.Array[Commit],
      lastRelease: LastRelease,
      nextRelease: NextRelease,
      releases: js.Array[Release]
    ): Commits = {
      val __obj = js.Dynamic.literal(commits = commits.asInstanceOf[js.Any], lastRelease = lastRelease.asInstanceOf[js.Any], nextRelease = nextRelease.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commits]
    }
    
    @scala.inline
    implicit class CommitsMutableBuilder[Self <: Commits] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommits(value: js.Array[Commit]): Self = StObject.set(x, "commits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommitsVarargs(value: Commit*): Self = StObject.set(x, "commits", js.Array(value :_*))
      
      @scala.inline
      def setLastRelease(value: LastRelease): Self = StObject.set(x, "lastRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextRelease(value: NextRelease): Self = StObject.set(x, "nextRelease", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleases(value: js.Array[Release]): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleasesVarargs(value: Release*): Self = StObject.set(x, "releases", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Email extends StObject {
    
    /**
      * The committer email.
      */
    var email: String = js.native
    
    /**
      * The committer name.
      */
    var name: String = js.native
    
    /**
      * The committer date.
      */
    var short: String = js.native
  }
  object Email {
    
    @scala.inline
    def apply(email: String, name: String, short: String): Email = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Error extends StObject {
    
    def error(message: String, vars: js.Any*): Unit = js.native
    
    def log(message: String, vars: js.Any*): Unit = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: (String, /* repeated */ js.Any) => Unit, log: (String, /* repeated */ js.Any) => Unit): Error = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction2(error), log = js.Any.fromFunction2(log))
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLog(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Long extends StObject {
    
    /**
      * The commit tree hash.
      */
    var long: String = js.native
    
    /**
      * The commit abbreviated tree hash.
      */
    var short: String = js.native
  }
  object Long {
    
    @scala.inline
    def apply(long: String, short: String): Long = {
      val __obj = js.Dynamic.literal(long = long.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
      __obj.asInstanceOf[Long]
    }
    
    @scala.inline
    implicit class LongMutableBuilder[Self <: Long] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
    }
  }
}
