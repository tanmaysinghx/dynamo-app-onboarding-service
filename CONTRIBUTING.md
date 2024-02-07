# Contributing to Dynamo Ticketing Tool

Contributions are what makes the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

## House rules

- Before submitting a new issue or PR, check if it already exists in [issues](https://github.com/tanmaysinghx/dynamo-app-onboarding-service.git/issues) or [PRs](https://github.com/tanmaysinghx/dynamo-app-onboarding-service.git/pulls).
- GitHub issues: take note of the `🚨 needs approval` label.
  - **For Contributors**:
    - Feature Requests: Wait for a core member to approve and remove the `🚨 needs approval` label before you start coding or submit a PR.
    - Bugs, Security, Performance, Documentation, etc.: You can start coding immediately, even if the `🚨 needs approval` label is present. This label mainly concerns feature requests.
  - **Our Process**:
    - Issues from non-core members automatically receive the `🚨 needs approval` label.
    - We greatly value new feature ideas. To ensure consistency in the product's direction, they undergo review and approval.



## Priorities

<table>
  <tr>
    <td>
      Type of Issue
    </td>
    <td>
      Priority
    </td>
  </tr>
  <tr>
    <td>
      Minor improvements, non-core feature requests
    </td>
    <td>
      <a href="https://github.com/calcom/cal.com/issues?q=is:issue+is:open+sort:updated-desc+label:%22Low+priority%22">
        <img src="https://img.shields.io/badge/-Low%20Priority-green">
      </a>
    </td>
  </tr>
   <tr>
    <td>
      Confusing UX (... but working)
    </td>
    <td>
      <a href="https://github.com/calcom/cal.com/issues?q=is:issue+is:open+sort:updated-desc+label:%22Medium+priority%22">
        <img src="https://img.shields.io/badge/-Medium%20Priority-yellow">
      </a>
    </td>
  </tr>
  <tr>
    <td>
      Core Features (Booking page, availability, timezone calculation)
    </td>
    <td>
      <a href="https://github.com/calcom/cal.com/issues?q=is:issue+is:open+sort:updated-desc+label:%22High+priority%22">
        <img src="https://img.shields.io/badge/-High%20Priority-orange">
      </a>
    </td>
  </tr>
  <tr>
    <td>
      Core Bugs (Login, Booking page, Emails are not working)
    </td>
    <td>
      <a href="https://github.com/calcom/cal.com/issues?q=is:issue+is:open+sort:updated-desc+label:Urgent">
        <img src="https://img.shields.io/badge/-Urgent-red">
      </a>
    </td>
  </tr>
</table>

## Developing

The development branch is `main`. This is the branch that all pull
requests should be made against. The changes on the `main`
branch are tagged into a release monthly.

To develop locally:

1. [Fork](https://help.github.com/articles/fork-a-repo/) this repository to your
   own GitHub account and then
   [clone](https://help.github.com/articles/cloning-a-repository/) it to your local device.
2. Create a new branch:

   ```sh
   git checkout -b MY_BRANCH_NAME
   ```
3. Follow setup steps [README.md](README.md) file.

### Running tests

This will run and test all flows in multiple Chromium windows to verify that no critical flow breaks:

```sh
mvn test
```

If you get errors, be sure to fix them before committing.

## Making a Pull Request

- Be sure to [check the "Allow edits from maintainers" option](https://docs.github.com/en/pull-requests/collaborating-with-pull-requests/working-with-forks/allowing-changes-to-a-pull-request-branch-created-from-a-fork) while creating your PR.
- If your PR refers to or fixes an issue, be sure to add `refs #XXX` or `fixes #XXX` to the PR description. Replacing `XXX` with the respective issue number. See more about [Linking a pull request to an issue](https://docs.github.com/en/issues/tracking-your-work-with-issues/linking-a-pull-request-to-an-issue).
- Be sure to fill the PR Template accordingly.


   ```bash
   git push origin <your-branch-name> --force
   ```


1. **Checkout a Previous Version**:
   - Take the latest pull from main branch
     ```bash
     git pull origin main
     ```
   - verify your local branch:
     ```bash
     git branch
     ```

2. **Proceed with Caution**:
   - If you need to push this change, first pull the latest changes from your remote branch to ensure you're not overwriting other recent changes:
     ```bash
     git pull origin <your-branch-name>
     ```
   - Then push the updated branch:
     ```bash
     git push origin <your-branch-name>
     ```
