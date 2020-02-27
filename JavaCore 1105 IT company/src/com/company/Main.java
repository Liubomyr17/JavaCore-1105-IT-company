package com.company;

/*

1105 IT company
Fix nine classes: Worker (employee), Clerk (clerk), IT (IT specialist), Programmer (programmer), ProjectManager (project manager), CTO (CTO), HR (recruiter), OfficeManager (office manager), Cleaner
Inherit a programmer, project manager, and technical director from an IT professional.
Inherit the recruiter, cleaner, and office manager from the clerk.
Inherit the clerk and IT professional from the employee.
Requirements:
1. In the class Solution there must be a public class Worker (employee).
2. In the class Solution there must be a public class Clerk (clerk).
3. The Solution class must have a public IT class (IT specialist).
4. In the class Solution there must be a public class Programmer (programmer).
5. In the class Solution there should be a public class ProjectManager (project manager).
6. The Solution class must have a public CTO class (CTO).
7. In the class Solution there must be a public class HR (recruiter).
8. The Solution class must have a public class OfficeManager (office manager).
9. The Solution class must have a public Cleaner class.
10. The classes Programmer, ProjectManager and CTO must be inherited from the class IT.
11. The HR, Cleaner, and OfficeManager classes must be inherited from the Clerk class.
12. The Clerk and IT classes must be inherited from the Worker class.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {
    }

    public class Worker
    {
        private String name;
    }

    public class Clerk extends Worker
    {

    }

    public class IT extends Worker
    {

    }

    public class Programmer extends IT
    {

    }

    public class ProjectManager extends IT
    {

    }

    public class CTO extends IT
    {

    }

    public class OfficeManager extends Clerk
    {

    }

    public class HR extends Clerk
    {

    }

    public class Cleaner extends Clerk
    {

    }
}






















