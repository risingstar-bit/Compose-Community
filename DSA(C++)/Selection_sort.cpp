c

int main()
{
	int n;
	cin>>n;
	vector<int> v(n);
	for(int i=0;i<n;i++)
	{
		cin>>v[i];
			}
			int mn;
			for(int i=0;i<n;i++)
			{
				mn=i;
				for(int j=i+1;j<n;j++)
				{
					if(v[j]<v[mn])
						mn=j;
				}
				swap(v[mn],v[i]);
							}
							for(int i=0;i<n;i++)
								cout<<v[i]<<" ";
} 